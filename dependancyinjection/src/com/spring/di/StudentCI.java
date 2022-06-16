package com.spring.di;

public class StudentCI {

	private int id;
	private String studentName;	

	public StudentCI(int id) {
		this.id = id;
	}
	
	public StudentCI(int id, String studentName) {

		this.id = id;
		this.studentName = studentName;
	}



	public void displayStudentInfo() {
			
		System.out.println("Student name is : " + studentName + " and the id is : " + id);
	}

	
}
