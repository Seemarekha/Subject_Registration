package Admin.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import Admin.model.AdminModel;

public class AdminDao {
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/student_registration","root","Alok613@");
		
	}
	
	public boolean authenticateAdmin(String email, String password) {
		AdminModel admin = getAdminModelByEmail(email) ;
		if(admin != null) {
			 if (email.equals(admin.getEmail()) && password.equals(admin.getPassword())) {
	                return true;
	            }
		}
		
	
		return false;
		
	}

	private AdminModel getAdminModelByEmail(String email) {
		// TODO Auto-generated method stub
		
		AdminModel admin = null;
		
		 if ("admin@cutm.ac.in".equals(email)) {
		        admin = new AdminModel();
		        admin.setEmail("admin@cutm.ac.in");
		        admin.setPassword("admin@123");
		        
		    }
		return admin;
	}

}
