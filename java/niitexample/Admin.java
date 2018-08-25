package niitexample;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import niitexample.dao.StudentDAO;
import niitexample.entity.Student;


public class Admin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<Student> student =null;
		PrintWriter out = response.getWriter();
		try {
		student=StudentDAO.getStudent();
		
	
		
		out.println("<html>");
		out.println("<head>");
		out.println("<h1> The details of the students</h>");
		out.println("<body>");
		
		
		for(Student s:student)
		{
			out.println(s);
		}
		
		}catch(Throwable ex)
		{
			System.out.println(ex);
		}
		
		out.println("</body>");
		
		out.println("</html>");
		out.println("</head>");
		
//		request.setAttribute("list", student); //categorylist is an arraylist      contains object of class category  
	//			getServletConfig().getServletContext().getRequestDispatcher("/Admin.html").forward(request,response);
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
