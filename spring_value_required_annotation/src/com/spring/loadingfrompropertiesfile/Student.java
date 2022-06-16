package com.spring.loadingfrompropertiesfile;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {

	@Value("${student.name}") //injecting dependency is done using object reference and not by setter method
	private String name;
	
	@Value("${student.interestedCourse}")
	private String interestedCourse;
	
	@Value("${student.hobby}")
	private String hobby;
	
	/*@Value("${student.name}")
	public void setName(String name) {
		this.name = name;
		System.out.println("using the setName method");
	}

	@Required
	@Value("${student.interestedCourse}")
	public void setInterestedCourse(String interestedCourse) {
		this.interestedCourse = interestedCourse;
		System.out.println("using the setInterestedCourse method");
	}

	@Required
	@Value("${student.hobby}")
	public void setHobby(String hobby) {
		this.hobby = hobby;
		System.out.println("using the setHobby method");
	} */
	
	public void dispayStudentInfo()
	{
		System.out.println("Student name " + name);
		System.out.println("Student interested course  " + interestedCourse);
		System.out.println("Student hobby  " + hobby);
	}
	
}
