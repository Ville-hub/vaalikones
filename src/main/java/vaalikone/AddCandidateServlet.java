package vaalikone;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import persist.Candidate;

/**
 * Servlet implementation class AddCandidateServlet
 */

public class AddCandidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCandidateServlet() {
		
    }

      
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		response.setContentType("text/plain");
		String firstName = request.getParameter("fname");
		String lastName = request.getParameter("lname");
		String puolue = request.getParameter("puolue");
		String kotipaikkakunta = request.getParameter("kotipaikkakunta");
		String ika = request.getParameter("ika");
		String miksi_eduskuntaan = request.getParameter("miksieduskuntaan");
		String mita_asioita_haluat_edistaa = request.getParameter("mita_asioita_haluat_edistaa");
		String ammatti = request.getParameter("ammatti");
		
		
		
		
	
		
		
		try {
			// get db connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vaalikone?user=root&password=password"); 
			if (con != null) {
			
			// create sql for insert
			String sql = "insert into EHDOKKAAT "
					   + "( SUKUNIMI,ETUNIMI,PUOLUE,KOTIPAIKKAKUNTA,IKA,MIKSI_EDUSKUNTAAN,MITA_ASIOITA_HALUAT_EDISTAA,AMMATTI) "
					   + "values (  ?, ?, ?, ?, ?, ?, ?, ?)";
			
			 PreparedStatement preparedStmt = con.prepareStatement(sql);
			
			// set the param values for the student
			 out.println("Hello this is a test");
			
			 preparedStmt.setString(1,lastName);
			 preparedStmt.setString(2,firstName);
			 preparedStmt.setString(3,puolue);
			 preparedStmt.setString(4,kotipaikkakunta);
			 preparedStmt.setString(5,ika);
			 preparedStmt.setString(6,miksi_eduskuntaan);
			 preparedStmt.setString(7,mita_asioita_haluat_edistaa);
			 preparedStmt.setString (8, ammatti);

			  preparedStmt.execute();
			  
			
			  
			  RequestDispatcher requestDispatcher = request
	                    .getRequestDispatcher("/addquestions.jsp");
	            requestDispatcher.forward(request, response);
			} } catch (SQLException ex) {
				
		           ex.printStackTrace();
		       }
	}
		




	private void close(Connection myConn, Statement myStmt, ResultSet myRs) {
		try {
			if(myRs != null) {
				myRs.close();
			}
			
			if(myStmt != null) {
				myStmt.close(); 
			}
			
			if(myConn != null) {
				myConn.close();
			}
		}
		catch(Exception exc) {
			exc.printStackTrace();
		}
		
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	


}
