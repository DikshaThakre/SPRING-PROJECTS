package com.spring.di;

public class Student {

	private int id;
	private String studentName;

	//As it is private, its not accessible in Exam.java So we will use setter-getter method to make it accessible
	//Injected the value for my dependency using the setter method.

	public void setId(int id) {
		this.id = id;
		System.out.println("setter method called : " + " :setId");
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
		System.out.println("setter method called : " + " :setStudentName");
	}	

	public void displayStudentInfo() {
			
		System.out.println("Student name is : " + studentName + " and the id is : " + id);
	}

	
}
