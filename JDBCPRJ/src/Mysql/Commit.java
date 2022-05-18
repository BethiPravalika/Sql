package Mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Commit {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/db1", "root" , "ravali");
			
			conn.setAutoCommit(false);
			Statement stmt = conn.createStatement();
			String query1 = "INSERT into Learner(LID,Lname,Lcourse) values(4,'Amma','Python')";
			stmt.executeUpdate(query1);
			
			//conn commit();
			System.out.println("Row Inserted");
		}
		catch(Exception e) {
		e.printStackTrace();
		}
	}
}
		
