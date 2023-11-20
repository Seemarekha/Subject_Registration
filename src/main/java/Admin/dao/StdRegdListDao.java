package Admin.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Admin.model.StdModel;

public class StdRegdListDao {
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/online_examination_system","root","sutun@123");
		
	}
	
	public List<StdModel> getRegisteredStudent(){
		
		List<StdModel> stdmodel = new ArrayList<>();
		
		Connection con= null;
	
		
		try {
			con=StdRegdListDao.getConnection();
			
			con.setAutoCommit(false);
			PreparedStatement ps = con.prepareStatement("SELECT * FROM std_details");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				
				StdModel std = new StdModel();
				std.setStd_regd(rs.getString("std_regd"));
				std.setStd_name(rs.getString("std_name"));
				std.setSemester(rs.getString("semester"));
				std.setAcademic_year(rs.getString("academic_year"));
				
				stdmodel.add(std);
			}
					
					
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stdmodel;
		
	}

}
