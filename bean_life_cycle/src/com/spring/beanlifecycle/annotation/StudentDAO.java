package com.spring.beanlifecycle.annotation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class StudentDAO {

	private String driver;
	private String url;
	private String userName;
	private String password;
	
	Connection con;
	
	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		System.out.println("setting driver..");
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		System.out.println("setting url..");
		this.url = url;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		System.out.println("setting userName..");
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		System.out.println("setting password..");
		this.password = password;
	}
	
	//@PostConstruct
	public void init() throws ClassNotFoundException, SQLException
	{
		System.out.println("inside the custom init method");
		createStudentDBConnection();
	}
	
	//@PostConstruct
	public void createStudentDBConnection() throws ClassNotFoundException, SQLException
	{
		System.out.println("Creating connection..");
		//load driver
		Class.forName(driver);
				
		//get a connection
		con = DriverManager.getConnection(url, userName, password);
	}

	public void selectAllRows() throws ClassNotFoundException, SQLException
	{
		System.out.println("Retriving all students data");
		//createStudentDBConnection();
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
		
	}
	
	public void deleteStudentRecord(int studentId) throws ClassNotFoundException, SQLException
	{				
		//createStudentDBConnection();	
		//execute query
		Statement stmt = con.createStatement();
				
		stmt.executeUpdate("delete from Demo.HostelStudentInfo where ID = " + studentId);
				
		System.out.println("Record deleted with the id " + studentId);
				
	}
	
	public void closeConnection() throws SQLException
	{
		System.out.println("destroy is called...");
		//closing the connection, cleanup 
		con.close();
	}
	
	//@PreDestroy
	public void destroy() throws SQLException //we can any name in place of destroy
	{
		//clean up job
		System.out.println("inside destroy method");
		closeConnection();
	}
	
	
}