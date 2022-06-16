package com.spring.beanlifecycle.annotation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDAOBackup {

	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/Demo";
	private String userName = "root";
	private String password = "Password@123";
	
	public void selectAllRows() throws ClassNotFoundException, SQLException
	{
		System.out.println("Retriving all students data");
		//load driver
		Class.forName(driver);
		
		//get a connection
		Connection con = DriverManager.getConnection(url, userName, password);
		
		//execute query
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery("select * from Demo.HostelStudentInfo");
		
		while(rs.next())
		{
			int studentId = rs.getInt(1);
			String studentName = rs.getString(2);
			String department = rs.getString(3);
			String food = rs.getString(4);
			String year = rs.getString(5);
			
			System.out.println(studentId + " " + studentName + " " + department + " " + food + " " + year);
			
		}
		
		con.close();
		
	}
	
	public void deleteStudentRecord(int studentId) throws ClassNotFoundException, SQLException
	{
		//load driver
				Class.forName(driver);
				
				//get a connection
				Connection con = DriverManager.getConnection(url, userName, password);
				
				//execute query
				Statement stmt = con.createStatement();
				
				stmt.executeUpdate("delete from Demo.HostelStudentInfo where ID = " + studentId);
				
				System.out.println("Record deleted with the id " + studentId);
				
				con.close();
	}
	
}