package com.input;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class MenuDrivenprograms {

	public static void main(String[] args) {



		int id,age;
		String name,course,address;
		String sql;
		Connection con = null;
		Statement stmt=null;
		ResultSet rs=null;
		Scanner sc=new Scanner(System.in);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/db1", "root" , "ravali");
			System.out.println("Succesfully database connected");
			System.out.println("==============================");
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    	while(true) {
    		System.out.println("Enter your option:\n");
    		System.out.println("1.create a table");
    		System.out.println("2.insert values into table");
    		System.out.println("3.update values");
    		System.out.println("4.delete values");
    		System.out.println("5.display table");
    		System.out.println("6.search element by id");
    		System.out.println("7.commit");
    		System.out.println("8.rollback");
    		System.out.println("9.exit");
    		
    		int operation=sc.nextInt();
	
    		switch(operation) {
    		case 1:
    			System.out.println("create table:");
    			try {
    			stmt=con.createStatement();
    			sql="create table learner(lid int primary key auto_increment,"
    					+ "lname varchar(255) not null,lage int check,lcourse varchar(255) default'JFS',laddress varchar(255))";
    			stmt.executeUpdate(sql);
    			}
    			catch(Exception e) {
    				System.out.println("table created in given database");
    			}
    			break;
    		case 2:
    			System.out.println("Enter lid: ");
    			sc.nextInt();
    			System.out.println("Enter lname: ");
    			sc.next();
    			System.out.println("Enter lage: ");
    			sc.nextInt();
    			System.out.println("Enter lcourse: ");
    			sc.next();
    			System.out.println("Enter laddress: ");
    			sc.next();
    			try {
    			stmt=con.createStatement();
    			sql="insert into learner(lid,lname,lage,lcourse,laddress)values("+","+","+","+","+")";
    			stmt.executeUpdate(sql);
    			System.out.println("records inserted");
    			}
    			catch(Exception e) {
    				e.printStackTrace();
    			}
    			break;
    		case 3:
    			try {
    			System.out.println("Enter lname:");
    			sc.nextLine();
    			System.out.println("Enter lid:");
    			sc.nextInt();
   				stmt=con.createStatement();
             	sql="update learner set lname="+" where lid="+" ";
    		    stmt.executeUpdate(sql);
    		    System.out.println("values updated");
    			}
    			catch(Exception e) {
    				e.printStackTrace();
    			}
    			break;
    		case 4:
    			System.out.println("Enter lid:");
    			sc.nextInt();
    			try {
    				stmt=con.createStatement();
    				sql="delete from learner where lid='+' ";
    			}
    			catch(Exception e) {
    				e.printStackTrace();
    			}
    			break;
    		case 5:
    			try {
    			stmt=con.createStatement();
    			sql="select*from learner";
    			rs=stmt.executeQuery(sql);
    			System.out.println("values are selected");
    			}
    			catch(Exception e) {
    				e.printStackTrace();
    			}
    			break;
    		case 6:
    			System.out.println("Enter lid:");
    			sc.nextInt();
    			try {
        		stmt=con.createStatement();
        		sql="select from learner ";
        		rs=stmt.executeQuery(sql);
        		System.out.println("values are selected");
        		}
       			catch(Exception e) {
       				e.printStackTrace();
                }
    			break;
    		
    		case 9:
    			System.out.println("Exit");
    			break;
    		default:
    			System.out.println("Exit operation.....");
    			System.out.println(0);

    			break;
    }
  }
 } 
}