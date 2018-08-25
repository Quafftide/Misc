package niitexample.dao;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import niitexample.entity.Student;

public class StudentDAO {
	
	public StudentDAO() {};
		

	public  static void addStudent(Student s) throws IOException, SQLException,ClassNotFoundException {
		
		String query ="insert into StudentNIIT(id,name,email,password,city,countru,address,gender) values (null,?,?,?,?,?,?,?)";
		
				
		Class.forName("com.mysql.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/neon","root","Roger@123");
		PreparedStatement st = con.prepareStatement(query);
		st.setString(1, s.getName());
		st.setString(2,s.getEmail());
		st.setString(3,s.getPassword());
		st.setString(4,s.getCity());
		st.setString(5,s.getCountry());
		st.setString(6,s.getAddress());
		st.setString(7,s.getGender());
		
		st.executeUpdate();
		st.close();
		con.close();

	}
	
	
public static ArrayList getStudent() throws IOException, SQLException,ClassNotFoundException {
		
		ArrayList<Student> student= new ArrayList<Student>();
		
	
		Class.forName("com.mysql.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/neon","root","Roger@123");
		PreparedStatement st = con.prepareStatement("select * from StudentNIIT");
		ResultSet rs =st.executeQuery();
		rs.next();
		while(rs.next())
		{
			 student.add(new Student(rs.getString("name"),rs.getString("email"),rs.getString("password"),rs.getString("city"),rs.getString("countru"),rs.getString("address"),rs.getString("gender")));
			 
		}
		
		st.close();
		con.close();
		
		
		return student;

}


}
