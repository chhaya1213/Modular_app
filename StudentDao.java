package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {

	public void insertdata()  throws Exception{
		/////////////Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection c =DriverManager.getConnection("jdbc:mysql://localhost:3306:demo1184","root","root");
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo1184", "root", "root");
		System.out.println("connected");

		Statement s=c.createStatement();
		s.executeUpdate("insert into student11 values(106,'aditi','pune',23)");
		System.out.println("data inserted successfully");
        c.close();
}
	
	public void update() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c =DriverManager.getConnection("jdbc:mysql://localhost:3306:demo1184","root","root");
		Statement s=c.createStatement();
		s.executeUpdate("update student11 set name=Ananya where id=102" );
		System.out.println("Data upadted successfully");
		c.close();
		}
	
	public void fetchallRecord() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306:demo1184","root","root");
		Statement s=c.createStatement();
		ResultSet rs = s.executeQuery("select * from student");
		while(rs.next()) 
		{
			int id =rs.getInt(1);
			String name= rs.getString(2);
			String city = rs.getString(3);	
			int age=rs.getInt(4);
			System.out.println("sid:"+id+"\nsName:"+name+"\nCity:"+city+"\nage");
			
		}
		c.close();
		
		}
	
	public void Delete()throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306:demo1184","root","root");
		Statement s=c.createStatement();
		s.executeUpdate("delete from student11 where id=103");
		System.out.println("data deleted successfully");
		c.close();
		
		
		
	}
}
