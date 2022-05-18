package Mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedDelete {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/db1", "root" , "ravali");
			PreparedStatement ps=conn.prepareStatement("Delete from Employee where  eid=3");
			ps.setInt(1, 102);
			int i=ps.executeUpdate();
			System.out.println(i+"records deleted");
			conn.close();
	}
		catch(Exception e) {
			e.printStackTrace();
		}

	}
}
