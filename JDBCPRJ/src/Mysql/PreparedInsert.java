package Mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedInsert {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/db1", "root" , "ravali");
			
			PreparedStatement stmt = conn.prepareStatement("INSERT INTO EMP VALUES");
			stmt.setInt(1, 65);
			stmt.setString(2, "Ayesha");
			stmt.setString(3, "fatima");
			stmt.setInt(4, 25);
			int i= stmt.executeUpdate();
			System.out.println(i+ "records inserted");
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
