package vaalikone;

import java.io.IOException;
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

/**
 * Servlet implementation class AddCandidateQuestionsServlet
 */

public class AddCandidateQuestionsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCandidateQuestionsServlet() {

        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// get answers for question 1
				String question1option1 = request.getParameter("question1option1");
				String question1option2 = request.getParameter("question1option2");
				String question1option3 = request.getParameter("question1option3");
				String question1option4 = request.getParameter("question1option4");
				String question1option5 = request.getParameter("question1option5");
				
				// get answers for question 2
				String question2option1 = request.getParameter("question2option1");
				String question2option2 = request.getParameter("question2option2");
				String question2option3 = request.getParameter("question2option3");
				String question2option4 = request.getParameter("question2option4");
				String question2option5 = request.getParameter("question2option5");
				
				// get answers for question 3
				String question3option1 = request.getParameter("question3option1");
				String question3option2 = request.getParameter("question3option2");
				String question3option3 = request.getParameter("question3option3");
				String question3option4 = request.getParameter("question3option4");
				String question3option5 = request.getParameter("question3option5");
				
				// get answers for question 4
				String question4option1 = request.getParameter("question4option1");
				String question4option2 = request.getParameter("question4option2");
				String question4option3 = request.getParameter("question4option3");
				String question4option4 = request.getParameter("question4option4");
				String question4option5 = request.getParameter("question4option5");
				
				// get answers for question 5
				String question5option1 = request.getParameter("question5option1");
				String question5option2 = request.getParameter("question5option2");
				String question5option3 = request.getParameter("question5option3");
				String question5option4 = request.getParameter("question5option4");
				String question5option5 = request.getParameter("question5option5");
				
				// get answers for question 6
				String question6option1 = request.getParameter("question6option1");
				String question6option2 = request.getParameter("question6option2");
				String question6option3 = request.getParameter("question6option3");
				String question6option4 = request.getParameter("question6option4");
				String question6option5 = request.getParameter("question6option5");
				
				// get answers for question 7
				String question7option1 = request.getParameter("question7option1");
				String question7option2 = request.getParameter("question7option2");
				String question7option3 = request.getParameter("question7option3");
				String question7option4 = request.getParameter("question7option4");
				String question7option5 = request.getParameter("question7option5");
				
				// get answers for question 8
				String question8option1 = request.getParameter("question8option1");
				String question8option2 = request.getParameter("question8option2");
				String question8option3 = request.getParameter("question8option3");
				String question8option4 = request.getParameter("question8option4");
				String question8option5 = request.getParameter("question8option5");
				
				// get answers for question 9
				String question9option1 = request.getParameter("question9option1");
				String question9option2 = request.getParameter("question9option2");
				String question9option3 = request.getParameter("question9option3");
				String question9option4 = request.getParameter("question9option4");
				String question9option5 = request.getParameter("question9option5");
				
				// get answers for question 10
				String question10option1 = request.getParameter("question10option1");
				String question10option2 = request.getParameter("question10option2");
				String question10option3 = request.getParameter("question10option3");
				String question10option4 = request.getParameter("question10option4");
				String question10option5 = request.getParameter("question10option5");
				
				// get answers for question 11
				String question11option1 = request.getParameter("question11option1");
				String question11option2 = request.getParameter("question11option2");
				String question11option3 = request.getParameter("question11option3");
				String question11option4 = request.getParameter("question11option4");
				String question11option5 = request.getParameter("question11option5");
				
				//get answers for question 12
				String question12option1 = request.getParameter("question12option1");
				String question12option2 = request.getParameter("question12option2");
				String question12option3 = request.getParameter("question12option3");
				String question12option4 = request.getParameter("question12option4");
				String question12option5 = request.getParameter("question12option5");
				
				// get answers for question 13
				String question13option1 = request.getParameter("question13option1");
				String question13option2 = request.getParameter("question13option2");
				String question13option3 = request.getParameter("question13option3");
				String question13option4 = request.getParameter("question13option4");
				String question13option5 = request.getParameter("question13option5");
				
				// get answers for question 14
						String question14option1 = request.getParameter("question14option1");
						String question14option2 = request.getParameter("question14option2");
						String question14option3 = request.getParameter("question14option3");
						String question14option4 = request.getParameter("question14option4");
						String question14option5 = request.getParameter("question14option5");
						
						// get answers for question 15
						String question15option1 = request.getParameter("question5option1");
						String question15option2 = request.getParameter("question15option2");
						String question15option3 = request.getParameter("question15option3");
						String question15option4 = request.getParameter("question15option4");
						String question15option5 = request.getParameter("question15option5");
						
						
						// get answers for question 16
						String question16option1 = request.getParameter("question16option1");
						String question16option2 = request.getParameter("question16option2");
						String question16option3 = request.getParameter("question16option3");
						String question16option4 = request.getParameter("question16option4");
						String question16option5 = request.getParameter("question16option5");
						
						// get answers for question 17
						String question17option1 = request.getParameter("question17option1");
						String question17option2 = request.getParameter("question17option2");
						String question17option3 = request.getParameter("question17option3");
						String question17option4 = request.getParameter("question17option4");
						String question17option5 = request.getParameter("question17option5");
						
						// get answers for question 18
						String question18option1 = request.getParameter("question18option1");
						String question18option2 = request.getParameter("question18option2");
						String question18option3 = request.getParameter("question18option3");
						String question18option4 = request.getParameter("question18option4");
						String question18option5 = request.getParameter("question18option5");
				
						// get answers for question 19
						String question19option1 = request.getParameter("question19option1");
						String question19option2 = request.getParameter("question19option2");
						String question19option3 = request.getParameter("question19option3");
						String question19option4 = request.getParameter("question19option4");
						String question19option5 = request.getParameter("question19option5");
						
						

					
						// gets the current highest Ehdokas_number from the table EHDOKKAAT ehdokas_id (last entered one through query)
						try
				        {
				           
				            Statement st;
				            ResultSet rs;

							Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vaalikone?user=root&password=password"); 
				            st=con.createStatement();
				            rs=st.executeQuery("Select MAX(EHDOKAS_ID) last_ehdokas FROM EHDOKKAAT");
				            int i=1;
				            while (rs.next())
				            {
				                i=rs.getInt(1);


				            }
				            System.out.println(""+i); 
				            int lastEhdokas = i;
				            String lastEhdokasString = Integer.toString(i); 
				            
				            // handling question 1
				        	if(question1option1 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "1");
								 preparedStmt.setString(3, question1option1);
								

								  preparedStmt.execute();
								  
									
							}
				            
				        	if(question1option2 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "1");
								 preparedStmt.setString(3, question1option2);
								

								  preparedStmt.execute();
								  
									
							}
				            
				          	if(question1option3 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "1");
								 preparedStmt.setString(3, question1option3);
								

								  preparedStmt.execute();
								  
									
							}
				          	
				          	if(question1option4 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "1");
								 preparedStmt.setString(3, question1option4);
								

								  preparedStmt.execute();
								  
									
							}
				          	
				          	if(question1option5 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "1");
								 preparedStmt.setString(3, question1option5);
								

								  preparedStmt.execute();
								  
									
							}
				          	
				          	 // handling question 2
				        	if(question2option1 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "2");
								 preparedStmt.setString(3, question2option1);
								

								  preparedStmt.execute();
								  
									
							}
				            
				        	if(question2option2 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "2");
								 preparedStmt.setString(3, question2option2);
								

								  preparedStmt.execute();
								  
									
							}
				            
				          	if(question2option3 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "2");
								 preparedStmt.setString(3, question2option3);
								

								  preparedStmt.execute();
								  
									
							}
				          	
				          	if(question2option4 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "2");
								 preparedStmt.setString(3, question2option4);
								

								  preparedStmt.execute();
								  
									
							}
				          	
				          	if(question2option5 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "2");
								 preparedStmt.setString(3, question2option5);
								

								  preparedStmt.execute();
								  
									
							}
				          	
				       	 // handling question 3
				        	if(question3option1 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "3");
								 preparedStmt.setString(3, question3option1);
								

								  preparedStmt.execute();
								  
									
							}
				            
				        	if(question3option2 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "3");
								 preparedStmt.setString(3, question3option2);
								

								  preparedStmt.execute();
								  
									
							}
				            
				          	if(question3option3 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "3");
								 preparedStmt.setString(3, question3option3);
								

								  preparedStmt.execute();
								  
									
							}
				          	
				          	if(question3option4 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "3");
								 preparedStmt.setString(3, question3option4);
								

								  preparedStmt.execute();
								  
									
							}
				          	
				          	if(question3option5 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "3");
								 preparedStmt.setString(3, question3option5);
								

								  preparedStmt.execute();
								  
									
							}
				          	
				       	 // handling question 4
				        	if(question4option1 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "4");
								 preparedStmt.setString(3, question4option1);
								

								  preparedStmt.execute();
								  
									
							}
				            
				        	if(question4option2 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "4");
								 preparedStmt.setString(3, question4option2);
								

								  preparedStmt.execute();
								  
									
							}
				            
				          	if(question4option3 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "4");
								 preparedStmt.setString(3, question4option3);
								

								  preparedStmt.execute();
								  
									
							}
				          	
				          	if(question4option4 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "4");
								 preparedStmt.setString(3, question4option4);
								

								  preparedStmt.execute();
								  
									
							}
				          	
				          	if(question4option5 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "4");
								 preparedStmt.setString(3, question4option5);
								

								  preparedStmt.execute();
								  
									
							}
				          	
				       	 // handling question 5
				        	if(question5option1 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "5");
								 preparedStmt.setString(3, question5option1);
								

								  preparedStmt.execute();
								  
									
							}
				            
				        	if(question5option2 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "5");
								 preparedStmt.setString(3, question5option2);
								

								  preparedStmt.execute();
								  
									
							}
				            
				          	if(question5option3 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "5");
								 preparedStmt.setString(3, question5option3);
								

								  preparedStmt.execute();
								  
									
							}
				          	
				          	if(question5option4 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "5");
								 preparedStmt.setString(3, question5option4);
								

								  preparedStmt.execute();
								  
									
							}
				          	
				          	if(question5option5 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "5");
								 preparedStmt.setString(3, question5option5);
								

								  preparedStmt.execute();
								  
									
							}
				          	
				       	 // handling question 6
				        	if(question6option1 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "6");
								 preparedStmt.setString(3, question6option1);
								

								  preparedStmt.execute();
								  
									
							}
				            
				        	if(question6option2 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "6");
								 preparedStmt.setString(3, question6option2);
								

								  preparedStmt.execute();
								  
									
							}
				            
				          	if(question6option3 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "6");
								 preparedStmt.setString(3, question6option3);
								

								  preparedStmt.execute();
								  
									
							}
				          	
				          	if(question6option4 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "6");
								 preparedStmt.setString(3, question6option4);
								

								  preparedStmt.execute();
								  
									
							}
				          	
				          	if(question6option5 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "6");
								 preparedStmt.setString(3, question6option5);
								

								  preparedStmt.execute();
								  
									
							}
				          	
				          	
				       	 // handling question 7
				        	if(question7option1 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "7");
								 preparedStmt.setString(3, question7option1);
								

								  preparedStmt.execute();
								  
									
							}
				            
				        	if(question7option2 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "7");
								 preparedStmt.setString(3, question7option2);
								

								  preparedStmt.execute();
								  
									
							}
				            
				          	if(question7option3 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "7");
								 preparedStmt.setString(3, question7option3);
								

								  preparedStmt.execute();
								  
									
							}
				          	
				          	if(question7option4 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "7");
								 preparedStmt.setString(3, question7option4);
								

								  preparedStmt.execute();
								  
									
							}
				          	
				          	if(question7option5 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "7");
								 preparedStmt.setString(3, question7option5);
								

								  preparedStmt.execute();
								  
									
							}
				          	
				       	 // handling question 8
				        	if(question8option1 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "8");
								 preparedStmt.setString(3, question8option1);
								

								  preparedStmt.execute();
								  
									
							}
				            
				        	if(question8option2 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "8");
								 preparedStmt.setString(3, question8option2);
								

								  preparedStmt.execute();
								  
									
							}
				            
				          	if(question8option3 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "8");
								 preparedStmt.setString(3, question8option3);
								

								  preparedStmt.execute();
								  
									
							}
				          	
				          	if(question8option4 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "8");
								 preparedStmt.setString(3, question8option4);
								

								  preparedStmt.execute();
								  
									
							}
				          	
				          	if(question8option5 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "8");
								 preparedStmt.setString(3, question8option5);
								

								  preparedStmt.execute();
								  
									
							}
				          	
				       	 // handling question 9
				        	if(question9option1 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "9");
								 preparedStmt.setString(3, question9option1);
								

								  preparedStmt.execute();
								  
									
							}
				            
				        	if(question9option2 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "9");
								 preparedStmt.setString(3, question9option2);
								

								  preparedStmt.execute();
								  
									
							}
				            
				          	if(question9option3 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "9");
								 preparedStmt.setString(3, question9option3);
								

								  preparedStmt.execute();
								  
									
							}
				          	
				          	if(question9option4 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "9");
								 preparedStmt.setString(3, question9option4);
								

								  preparedStmt.execute();
								  
									
							}
				          	
				          	if(question9option5 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "9");
								 preparedStmt.setString(3, question9option5);
								

								  preparedStmt.execute();
								  
									
							}
				          	
				       	 // handling question 10
				        	if(question10option1 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "10");
								 preparedStmt.setString(3, question10option1);
								

								  preparedStmt.execute();
								  
									
							}
				            
				        	if(question10option2 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "10");
								 preparedStmt.setString(3, question10option2);
								

								  preparedStmt.execute();
								  
									
							}
				            
				          	if(question10option3 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "10");
								 preparedStmt.setString(3, question10option3);
								

								  preparedStmt.execute();
								  
									
							}
				          	
				          	if(question10option4 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "10");
								 preparedStmt.setString(3, question10option4);
								

								  preparedStmt.execute();
								  
									
							}
				          	
				          	if(question10option5 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "10");
								 preparedStmt.setString(3, question10option5);
								

								  preparedStmt.execute();
								  
									
							}
				          	
				       	 // handling question 11
				        	if(question11option1 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "11");
								 preparedStmt.setString(3, question11option1);
								

								  preparedStmt.execute();
								  
									
							}
				            
				        	if(question11option2 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "11");
								 preparedStmt.setString(3, question11option2);
								

								  preparedStmt.execute();
								  
									
							}
				            
				          	if(question11option3 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "11");
								 preparedStmt.setString(3, question11option3);
								

								  preparedStmt.execute();
								  
									
							}
				          	
				          	if(question11option4 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "11");
								 preparedStmt.setString(3, question11option4);
								

								  preparedStmt.execute();
								  
									
							}
				          	
				          	if(question11option5 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "11");
								 preparedStmt.setString(3, question11option5);
								

								  preparedStmt.execute();
								  
									
							}
				          	
				       	 // handling question 12
				        	if(question12option1 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "12");
								 preparedStmt.setString(3, question12option1);
								

								  preparedStmt.execute();
								  
									
							}
				            
				        	if(question12option2 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "12");
								 preparedStmt.setString(3, question12option2);
								

								  preparedStmt.execute();
								  
									
							}
				            
				          	if(question12option3 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "12");
								 preparedStmt.setString(3, question12option3);
								

								  preparedStmt.execute();
								  
									
							}
				          	
				          	if(question12option4 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "12");
								 preparedStmt.setString(3, question12option4);
								

								  preparedStmt.execute();
								  
									
							}
				          	
				          	if(question12option5 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "12");
								 preparedStmt.setString(3, question12option5);
								

								  preparedStmt.execute();
								  
									
							}
				          	
				       	 // handling question 13
				        	if(question13option1 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "13");
								 preparedStmt.setString(3, question13option1);
								

								  preparedStmt.execute();
								  
									
							}
				            
				        	if(question13option2 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "13");
								 preparedStmt.setString(3, question13option2);
								

								  preparedStmt.execute();
								  
									
							}
				            
				          	if(question13option3 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "13");
								 preparedStmt.setString(3, question13option3);
								

								  preparedStmt.execute();
								  
									
							}
				          	
				          	if(question13option4 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "13");
								 preparedStmt.setString(3, question13option4);
								

								  preparedStmt.execute();
								  
									
							}
				          	
				          	if(question13option5 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "13");
								 preparedStmt.setString(3, question13option5);
								

								  preparedStmt.execute();
								  
									
							}
				          	
				       	 // handling question 14
				        	if(question14option1 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "14");
								 preparedStmt.setString(3, question14option1);
								

								  preparedStmt.execute();
								  
									
							}
				            
				        	if(question14option2 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "14");
								 preparedStmt.setString(3, question14option2);
								

								  preparedStmt.execute();
								  
									
							}
				            
				          	if(question14option3 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "14");
								 preparedStmt.setString(3, question14option3);
								

								  preparedStmt.execute();
								  
									
							}
				          	
				          	if(question14option4 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "14");
								 preparedStmt.setString(3, question14option4);
								

								  preparedStmt.execute();
								  
									
							}
				          	
				          	if(question14option5 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "14");
								 preparedStmt.setString(3, question14option5);
								

								  preparedStmt.execute();
								  
									
							}
				          	
				       	 // handling question 15
				        	if(question15option1 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "15");
								 preparedStmt.setString(3, question15option1);
								

								  preparedStmt.execute();
								  
									
							}
				            
				        	if(question15option2 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "15");
								 preparedStmt.setString(3, question15option2);
								

								  preparedStmt.execute();
								  
									
							}
				            
				          	if(question15option3 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "15");
								 preparedStmt.setString(3, question15option3);
								

								  preparedStmt.execute();
								  
									
							}
				          	
				          	if(question15option4 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "15");
								 preparedStmt.setString(3, question15option4);
								

								  preparedStmt.execute();
								  
									
							}
				          	
				          	if(question15option5 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "15");
								 preparedStmt.setString(3, question15option5);
								

								  preparedStmt.execute();
								  
									
							}
				          	
				       	 // handling question 16
				        	if(question16option1 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "16");
								 preparedStmt.setString(3, question16option1);
								

								  preparedStmt.execute();
								  
									
							}
				            
				        	if(question16option2 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "16");
								 preparedStmt.setString(3, question16option2);
								

								  preparedStmt.execute();
								  
									
							}
				            
				          	if(question16option3 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "16");
								 preparedStmt.setString(3, question16option3);
								

								  preparedStmt.execute();
								  
									
							}
				          	
				          	if(question16option4 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "16");
								 preparedStmt.setString(3, question16option4);
								

								  preparedStmt.execute();
								  
									
							}
				          	
				          	if(question16option5 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "16");
								 preparedStmt.setString(3, question16option5);
								

								  preparedStmt.execute();
								  
									
							}
				          	
				       	 // handling question 17
				        	if(question17option1 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "17");
								 preparedStmt.setString(3, question17option1);
								

								  preparedStmt.execute();
								  
									
							}
				            
				        	if(question17option2 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "17");
								 preparedStmt.setString(3, question17option2);
								

								  preparedStmt.execute();
								  
									
							}
				            
				          	if(question17option3 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "17");
								 preparedStmt.setString(3, question17option3);
								

								  preparedStmt.execute();
								  
									
							}
				          	
				          	if(question17option4 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "17");
								 preparedStmt.setString(3, question17option4);
								

								  preparedStmt.execute();
								  
									
							}
				          	
				          	if(question17option5 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "17");
								 preparedStmt.setString(3, question17option5);
								

								  preparedStmt.execute();
								  
									
							}
				          	
				       	 // handling question 18
				        	if(question18option1 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "18");
								 preparedStmt.setString(3, question18option1);
								

								  preparedStmt.execute();
								  
									
							}
				            
				        	if(question18option2 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "18");
								 preparedStmt.setString(3, question18option2);
								

								  preparedStmt.execute();
								  
									
							}
				            
				          	if(question18option3 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "18");
								 preparedStmt.setString(3, question18option3);
								

								  preparedStmt.execute();
								  
									
							}
				          	
				          	if(question18option4 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "18");
								 preparedStmt.setString(3, question18option4);
								

								  preparedStmt.execute();
								  
									
							}
				          	
				          	if(question18option5 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "18");
								 preparedStmt.setString(3, question18option5);
								

								  preparedStmt.execute();
								  
									
							}
				          	
				       	 // handling question 19
				        	if(question19option1 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "19");
								 preparedStmt.setString(3, question19option1);
								

								  preparedStmt.execute();
								  
									
							}
				            
				        	if(question19option2 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "19");
								 preparedStmt.setString(3, question19option2);
								

								  preparedStmt.execute();
								  
									
							}
				            
				          	if(question19option3 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "19");
								 preparedStmt.setString(3, question19option3);
								

								  preparedStmt.execute();
								  
									
							}
				          	
				          	if(question19option4 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "19");
								 preparedStmt.setString(3, question19option4);
								

								  preparedStmt.execute();
								  
									
							}
				          	
				          	if(question19option5 != null) {
								String sql = "insert into VASTAUKSET "
										   + "(EHDOKAS_ID, KYSYMYS_ID, VASTAUS) "
										   + "values (  ?, ?, ?)";
								
								 PreparedStatement preparedStmt = con.prepareStatement(sql);
								
								
								
								 preparedStmt.setLong(1, i);
								 preparedStmt.setString(2, "19");
								 preparedStmt.setString(3, question19option5);
								

								  preparedStmt.execute();
								  
									
							}
				          	
				            RequestDispatcher requestDispatcher = request
				                    .getRequestDispatcher("/added_succesfully.jsp");
				            requestDispatcher.forward(request, response);
				            con.close();
				            st.close();
				            rs.close();
				        }
				        catch (Exception e)
				        {
				        e.printStackTrace();
				        }
						

						/// go through answers for question 1
					
					
						
					}


	

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
