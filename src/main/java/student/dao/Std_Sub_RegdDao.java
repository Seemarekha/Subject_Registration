package student.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import student.model.Regd_Login;
import student.model.Student_Sub_Regd;

public class Std_Sub_RegdDao {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/online_examination_system","root","root");	
	}
	public boolean SubRegd(String regd_no , String std_name , String semester , String academic_year) throws SQLException, ClassNotFoundException
	{
		
		Connection con =null ;
	    
		try {
			con = LoginDao.getConnection();
			//con.setAutoCommit(false);
			PreparedStatement prd= con.prepareStatement(" insert into std_details(regd_no,std_name,semester,academic_year) values(?,?,?,?)");
			prd.setString(1, regd_no);
			prd.setString(2, std_name);
			prd.setString(3, semester);
            prd.setString(4, academic_year);
			prd.executeUpdate(); 
			
			 	 
            }catch(SQLException e) {
	              e.printStackTrace();
	              //con.rollback();
            }finally {
	              con.close();
           }
		   return true;
	}

	

	
}
	
	
	

