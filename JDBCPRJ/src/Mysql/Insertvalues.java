package Mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insertvalues {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/db1", "root" , "ravali");
			Statement stmt = conn.createStatement();
            String sql = "INSERT INTO emp(eid,firstname,lastname,age) VALUES(2,'Pravalika','Bethi',24)";
            stmt.executeUpdate(sql);
            
            sql = "INSERT INTO emp(eid,firstname,lastname,age)  VALUES(5,'Srinivas','Myana',28)";
            stmt.executeUpdate(sql);
            
            System.out.println("Record is inserted in the table");
		}
		catch(Exception e) {
			e.printStackTrace();
		}

		
		
	}

}
