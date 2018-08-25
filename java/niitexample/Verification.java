package niitexample;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import niitexample.dao.StudentDAO;
import niitexample.entity.Student;



public class Verification extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		try{
		
		Student student = new Student();
		
		student.setName(request.getParameter("name"));
		student.setEmail(request.getParameter("email"));
		student.setPassword(request.getParameter("password"));
		student.setCity(request.getParameter("city"));
		student.setCountry(request.getParameter("country"));
		student.setAddress(request.getParameter("address"));
		student.setGender(request.getParameter("gender"));
		
		StudentDAO.addStudent(student);
		
		}
		catch(Throwable theException)
		{
			System.out.println(theException);
		}
	
		
	response.sendRedirect("LoginPage.html");
		
		}
		
	
		
		
		

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
