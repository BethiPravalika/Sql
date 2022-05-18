package Mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectData {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/db1", "root" , "ravali");
			Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from emp");
            
            while(rs.next()) {
            	//Display values
            	System.out.println("EID: " + rs.getInt("eid"));
            	System.out.println(", Age: " + rs.getInt("age"));
            	System.out.println(", First Name: " + rs.getString("first name"));
            	System.out.println(", Last Name: " + rs.getString("last name"));

            }
		} catch(Exception e) {
		   e.printStackTrace();
		}
		

		
	}

}
