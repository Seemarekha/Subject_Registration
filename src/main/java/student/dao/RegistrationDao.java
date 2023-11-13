package student.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.SQLException;



import student.model.*;


public class RegistrationDao {
	public static Connection getConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/online_examination_system","root","root");
	}
	
	public int addStudent(Regd_Login rdata)throws ClassNotFoundException, SQLException
	{
		Connection con = null;
		int list=0;
		
		try
		{
			con = RegistrationDao.getConnection();
			con.setAutoCommit(false);
			PreparedStatement ps = con.prepareStatement("insert into std_login(regd_no,password) values(?,?)");
			ps.setString(1, rdata.getRegd_no());
			ps.setString(2,rdata.getPassword());
			 
			list = ps.executeUpdate();
			
			if(list!=0) {
				list=0;
			
			ps = con.prepareStatement("insert into std_regd(std_name,regd_no,email,contact_no,academic_year) values(?,?,?,?,?)");
			
			ps.setString(1, rdata.getStd_name());
			ps.setString(2,rdata.getRegd_no());
			ps.setString(3, rdata.getEmail());
			ps.setString(4, rdata.getContact_no());
			ps.setString(5, rdata.getAcademic_year());
			
			list = ps.executeUpdate();
			
		    if(list!=0)
			{
				con.commit();
			}
			else 
			{
				con.rollback();
			}
			}
	}
	catch(SQLException e)
		{
			e.printStackTrace();
			con.rollback();
		}
		finally
		{
			con.close();
		}
		return list;
		}
}
