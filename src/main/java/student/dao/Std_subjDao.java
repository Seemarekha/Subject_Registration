package student.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import student.model.stdnt_subj_redgn;


public class Std_subjDao {
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/registration", "root", "root");
    }
	
	public stdnt_subj_redgn addStudent(stdnt_subj_redgn model)throws SQLException{
		Connection con=null;
		

        try {
           con=getConnection();
           con.setAutoCommit(false);
            PreparedStatement ps = con.prepareStatement("insert into login(`fullname`,`regno`,`semester`,`academicyear`)values (?,?,?,?)");
            ps.setString(1,model.getFullname());
            ps.setString(2,model.getRegno());
            ps.setString(3,model.getSemester());
            ps.setString(4,model.getAcademicyear());
            

//            ps.setString(3,student.getName());
//            ps.setString(4,student.getAge());
           int status=ps.executeUpdate();
            
//            if(status!=0) {
//            	status=0;
//            	ps=con.prepareStatement("insert into student(Name,Age,User_Id)values(?,?,?");
//            	ps.setString(1,student.getName());
//                ps.setString(2,student.getAge());
//                ps.setString(3,student.getUser_Id());
//                status=ps.executeUpdate();
//
//                
                if(status!=0) {
                	con.commit();
                }else {
                	con.rollback();
                }
        }catch (Exception e) {
        	e.printStackTrace();
        	con.rollback();
        }
                finally {
                	con.close();
                }
                return model;
            }

}
