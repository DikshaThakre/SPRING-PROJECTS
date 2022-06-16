package com.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
	public static void main(String[] args) {
		
//		Airtel airtel = new Airtel();
//		airtel.calling();
//		airtel.data();
		
//		Vodaphone vodaphone = new Vodaphone();
//		vodaphone.calling();
//		vodaphone.data();
		
//	Problem is if we want to change the class reference, we need to do other unnecessary changes as well which is not good.
// So we can use best software engineering practices over here. So just use the interface reference here.
		
		//Sim sim = new Vodaphone();
//		Sim sim = new Airtel();
//		sim.calling();
//		sim.data();
		
//Now if client gives new requirement: Don't touch the source code. This application should be configurable.
//Heres Spring comes in picture.
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("config loaded");
		
//		Airtel air = (Airtel)context.getBean("airtel");		//(Airtel) to typecast (object to Airtel)
//		air.data();
//		
//		Vodaphone voda = context.getBean("vodaphone", Vodaphone.class);
//		voda.calling();
//		voda.data();
		
		Sim sim = context.getBean("sim", Sim.class);
		sim.calling();
		sim.data();
		
	}
}
