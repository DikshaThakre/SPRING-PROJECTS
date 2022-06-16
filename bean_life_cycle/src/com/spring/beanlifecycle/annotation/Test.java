package com.spring.beanlifecycle.annotation;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml"); //Added this to avoid the downcasting while closing the context.
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");  //This is the Abstract class having registerShutdownHook();
//		StudentDAO studentDao = context.getBean("studentDAO", StudentDAO.class);
//		System.out.println(studentDao);
//		studentDao.selectAllRows();
		Hello hello = context.getBean("hello", Hello.class);
		hello.sample();
		//((ClassPathXmlApplicationContext)context).close();
		context.close();
		//context.registerShutdownHook();
		
		//StudentDAO studentDao1 = context.getBean("studentDAO", StudentDAO.class); //Here we will get error "BeanFactory not initialized or already closed" if we do context.close() but not get if we do context.registerShutdownHook();
		
	}
}
