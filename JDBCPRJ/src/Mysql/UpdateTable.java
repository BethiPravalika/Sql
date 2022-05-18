package Mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateTable {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/db1", "root" , "ravali");
			Statement stmt = conn.createStatement();
			
            String sql = "Update  emp SET firstname='Sree' where eid=2";
            stmt.executeUpdate(sql);

            sql="Update emp  SET lastname='Bethi' where eid=2";
             stmt.executeUpdate(sql);
            
            System.out.println("values are updated .....");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
