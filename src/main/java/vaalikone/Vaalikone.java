 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vaalikone;

import java.io.IOException;
import static java.lang.Integer.parseInt;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.appengine.api.utils.SystemProperty;

import persist.Ehdokkaat;
import persist.Kysymykset;
import persist.Vastaukset;

/**
 * Vaalikone-servlet, vastaa vaalikoneen varsinaisesta toiminnallisuudesta
 *
 * @author Jonne
 */
public class Vaalikone extends HttpServlet {

	
    //hae java logger-instanssi
    private final static Logger logger = Logger.getLogger(Loki.class.getName());

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int kysymys_id;
        // get http-sessio and create new one if the old one doesn't exist
        // hae http-sessio ja luo uusi jos vanhaa ei ole vielä olemassa
        HttpSession session = request.getSession(true);
        //get user object from the http-session
        //hae käyttäjä-olio http-sessiosta
        Kayttaja usr = (Kayttaja) session.getAttribute("usrobj");
        //if the user object is not found in the session, create one
        //jos käyttäjä-oliota ei löydy sessiosta, luodaan sinne sellainen
        if (usr == null) {
            usr = new Kayttaja();
            logger.log(Level.FINE, "Luotu uusi k�ytt�j�olio");
            session.setAttribute("usrobj", usr);
        }
        EntityManagerFactory emf=null;
        EntityManager em = null;
        try {
  	      emf=Persistence.createEntityManagerFactory("vaalikones");
  	      em = emf.createEntityManager();
        }
        catch(Exception e) {
          	response.getWriter().println("EMF+EM EI Onnistu");
          	
          	e.printStackTrace(response.getWriter());
          	
          	return;
        }
        //get url-parameter func which defines the fucntion that you want to do
        //func=getEhdokas: get the information for a speficic candidate and compare them to the users answers
        //if not defined ask questions
        //hae url-parametri func joka määrittää toiminnon mitä halutaan tehdä.
        //func=haeEhdokas: hae tietyn ehdokkaan tiedot ja vertaile niitä käyttäjän vastauksiin
        //Jos ei määritelty, esitetään kysymyksiä.
        String strFunc = request.getParameter("func");

        if (strFunc == null) {
        	
            //hae parametrinä tuotu edellisen kysymyksen nro
        	// get the latest questions id number as a parameter
            String strKysymys_id = request.getParameter("q");

            //hae parametrina tuotu edellisen kysymyksen vastaus
            //get the answer to the latest question as a parameter
            String strVastaus = request.getParameter("vastaus");

            // Jos kysymyksen numero (kysId) on asetettu, haetaan tuo kysymys
            // muuten haetaan kysnro 1
            // If kysymys number (kysId) is set, get that question
            //otherwise get question number 1
            if (strKysymys_id == null) {
                kysymys_id = 1;
            } else {
                kysymys_id = parseInt(strKysymys_id);
                //if answer is set save it to the session users object
                //jos vastaus on asetettu, tallenna se session käyttäjä-olioon
                if (strVastaus != null) {
                    usr.addVastaus(kysymys_id, parseInt(strVastaus));
                }
                //define the question asked next
                //määritä seuraavaksi haettava kysymys
                kysymys_id++;
            }
            //if there are still questions left get the next one
            //jos kysymyksiä on vielä jäljellä, hae seuraava
            if (kysymys_id < 20) {
                try {
                	//get the question from the database
                    //Hae haluttu kysymys tietokannasta
                    Query q = em.createQuery(
                            "SELECT k FROM Kysymykset k WHERE k.kysymysId=?1");
                    q.setParameter(1, kysymys_id);
                    //Read?? the desired question to the list
                    //Lue haluttu kysymys listaan
                    List<Kysymykset> kysymysList = q.getResultList();
                    request.setAttribute("kysymykset", kysymysList);
                    request.getRequestDispatcher("/vastaus.jsp")
                            .forward(request, response);

                } finally {
                	// Close the database connection
                    // Sulje tietokantayhteys
                    if (em.getTransaction().isActive()) {
                        em.getTransaction().rollback();
                    }
                    em.close();
                }
                //if questions run out/end, calculate the result
                //jos kysymykset loppuvat, lasketaan tulos!
            } else {
            	//Empty the pisteet(points) array so that the points don't double with a possible page refresh
                //Tyhjennetään piste-array jotta pisteet eivät tuplaannu mahdollisen refreshin tapahtuessa
                for (int i = 0; i < 20; i++) {
                    usr.pisteet.set(i, new Tuple<>(0, 0));
                }
                //Query the list of candidates
                //Hae lista ehdokkaista
                Query qE = em.createQuery(
                        "SELECT e.ehdokasId FROM Ehdokkaat e"
                );
                List<Integer> ehdokasList = qE.getResultList();
                //iterate through the ehdokaslista (candidate list)
                //iteroi ehdokaslista läpi
                for (int i = 1; i < ehdokasList.size(); i++) {
                	//Query of the answers of the candidates
                    //Hae lista ehdokkaiden vastauksista
                    Query qV = em.createQuery(
                            "SELECT v FROM Vastaukset v WHERE v.vastauksetPK.ehdokasId=?1");
                    qV.setParameter(1, i);
                    List<Vastaukset> vastausList = qV.getResultList();
                    //Iterare through the vaustaslist (answerlist)
                    //iteroi vastauslista läpi
                    for (Vastaukset eVastaus : vastausList) {
                        int pisteet;
                        //get the users candidate specific points(not quite sure if this is right)
                        //hae käyttäjän ehdokaskohtaiset pisteet
                        pisteet = usr.getPisteet(i);
                        //calculate points based on the users and candidates answers
                        //laske oman ja ehdokkaan vastauksen perusteella pisteet 
                        pisteet += laskePisteet(usr.getVastaus(i), eVastaus.getVastaus());

                        logger.log(Level.INFO, "eID: {0} / k: {1} / kV: {2} / eV: {3} / p: {4}", new Object[]{i, eVastaus.getVastauksetPK().getKysymysId(), usr.getVastaus(i), eVastaus.getVastaus(), pisteet});
                        usr.addPisteet(i, pisteet);
                    }

                }
                //searh for the best candidate
                //siirrytään hakemaan paras ehdokas
                strFunc = "haeEhdokas";
            }

        }
        //if func value is haeEhdokas, get the candidates that fit the user best
        //jos func-arvo on haeEhdokas, haetaan haluttu henkilö käyttäjälle sopivimmista ehdokkaista
        if ("haeEhdokas".equals(strFunc)) {
        	//read from url-parameter "top-listan järjestysnumero". If it's not defined get the best option.
            //luetaan url-parametristä "top-listan järjestysnumero". Jos ei määritelty, haetaan PARAS vaihtoehto.
            String strJarjestysnumero = request.getParameter("numero");
            Integer jarjestysnumero = 0;
            if (strJarjestysnumero != null) {
                jarjestysnumero = Integer.parseInt(strJarjestysnumero);
            }
            //Read the most suitable candidates for the user in to a temporary Tuple list
            //Lue käyttäjälle sopivimmat ehdokkaat väliaikaiseen Tuple-listaan.
            List<Tuple<Integer, Integer>> tpl = usr.haeParhaatEhdokkaat();
            //query the defined candidates information
            //hae määritetyn ehdokkaan tiedot
            Query q = em.createQuery(
                    "SELECT e FROM Ehdokkaat e WHERE e.ehdokasId=?1");
            q.setParameter(1, tpl.get(jarjestysnumero).ehdokasId);
            List<Ehdokkaat> parasEhdokas = q.getResultList();
            //get the candidates answers
            //hae ko. ehdokkaan vastaukset
            q = em.createQuery(
                    "SELECT v FROM Vastaukset v WHERE v.vastauksetPK.ehdokasId=?1");
            q.setParameter(1, tpl.get(jarjestysnumero).ehdokasId);
            List<Vastaukset> parhaanEhdokkaanVastaukset = q.getResultList();
            //get all the questions
            //hae kaikki kysymykset
            q = em.createQuery(
                    "SELECT k FROM Kysymykset k");
            List<Kysymykset> kaikkiKysymykset = q.getResultList();
            //direct the information to the results page
            //ohjaa tiedot tulosten esityssivulle
            request.setAttribute("kaikkiKysymykset", kaikkiKysymykset);
            request.setAttribute("kayttajanVastaukset", usr.getVastausLista());
            request.setAttribute("parhaanEhdokkaanVastaukset", parhaanEhdokkaanVastaukset);
            request.setAttribute("parasEhdokas", parasEhdokas);
            request.setAttribute("pisteet", tpl.get(jarjestysnumero).pisteet);
            request.setAttribute("jarjestysnumero", jarjestysnumero);
            request.getRequestDispatcher("/tulokset.jsp")
                    .forward(request, response);
            // Close the database connection
            // Sulje tietokantayhteys
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            em.close();

        }

    }

    private Integer laskePisteet(Integer kVastaus, Integer eVastaus) {
        int pisteet = 0;
        if (kVastaus - eVastaus == 0) {
            pisteet = 3;
        }
        if (kVastaus - eVastaus == 1 || kVastaus - eVastaus == -1) {
            pisteet = 2;
        }
        if (kVastaus - eVastaus == 2 || kVastaus - eVastaus == -2 || kVastaus - eVastaus == 3 || kVastaus - eVastaus == -3) {
            pisteet = 1;
        }
        
        //if (kVastaus - eVastaus == 4 || kVastaus - eVastaus == -4) pisteet = 0;
        return pisteet;

    }

    //<editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
