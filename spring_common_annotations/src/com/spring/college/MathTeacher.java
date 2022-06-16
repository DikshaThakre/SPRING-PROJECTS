package com.spring.college;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary  //To resolve the error: expected single matching bean but found 2: mathTeacher,scienceTeacher
public class MathTeacher implements Teacher {

	@Override
	public void teach() {
		
		System.out.println("Hi I am your math teacher");
		System.out.println("My name is Saurav");

	}

}
