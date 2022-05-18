package Mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Rollback {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = null;

			conn = DriverManager.getConnection("jdbc:mysql://localhost/db1", "root" , "ravali");
			conn.setAutoCommit(false);
			Statement stmt = conn.createStatement();
			String query1="INSERT INTO Table(product,price) Values('laptop2',29000)";
			String query2="INSERT INTO Table(product,price) Values('laptop2',25000)";
            stmt.executeUpdate(query1);
            stmt.executeUpdate(query2);
            
            conn.commit();
            System.out.println("Row is inserted");
		}catch(Exception e){
					System.out.println("Transaction failed..");
			e.printStackTrace();
		}
	}
}




