package com.spring.college;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	public static void main(String[] args) {
		
		//ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);  //= new ClassPathXmlApplicationContext("beans.xml");
		//instead of interface, taking class reference
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
		//System.out.println("beans.xml file loaded");
		College college = context.getBean("college", College.class);
		System.out.println("The college object created by Spring is : " + college);
		college.test();
		//((AnnotationConfigApplicationContext)context).close(); //context belongs to ApplicationContext interface and this interface do not have close method, that's why doing type cast.
		context.close();
	}

}
