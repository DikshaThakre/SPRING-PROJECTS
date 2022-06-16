package com.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	
	public static void main(String[] args) {
		
		//------Without Spring------------		
//		Student student = new Student();
//		//student.studentName = "Diksha";
//		student.setStudentName("Diksha Thakre");
//		student.displayStudentInfo();
		
		//--------Using Spring-----------------
		//--------Spring Setter Injection-------
		
//		Student poonam = context.getBean("poonam", Student.class);
//		poonam.displayStudentInfo();
		
//		StudentCI diksh = new StudentCI(1, "Diksha");
//		diksh.displayStudentInfo();
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//		Student diksh = context.getBean("student", Student.class);
//		diksh.displayStudentInfo();
		
		//--------Spring Constructor Injection-------
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		StudentCI diksh = context.getBean("student", StudentCI.class);
		diksh.displayStudentInfo();
		
		StudentCI sakshi = context.getBean("sakshi", StudentCI.class);
		sakshi.displayStudentInfo();
	}

}
