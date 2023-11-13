package student.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import student.model.*;


public class LoginDao {
	public static Connection getConnection() throws ClassNotFoundException,SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/online_examination_system","root","root");
	}
	public Regd_Login checkLogin(String Registration, String Password) throws SQLException
	{

		Connection con =null ;
		ResultSet rs = null;
		Regd_Login user=null;
		try {
			con = LoginDao.getConnection();
			PreparedStatement prd= con.prepareStatement(" Select u.regd_no,u.std_name From std_regd u Join std_login l on u.regd_no=l.regd_no  where l.regd_no=? and l.password=?");
			prd.setString(1, Registration);
			prd.setString(2,Password);

			rs = prd.executeQuery(); 
			 
			 
				 while(rs.next()) {
						 user = new Regd_Login();
						user.setRegd_no(rs.getString("regd_no"));
						user.setStd_name(rs.getString("std_name"));
						System.out.println(user);			 

	                }
            }catch(Exception e) {
	              e.printStackTrace();
            }finally {
	              con.close();
           }
		return user;
      }
}