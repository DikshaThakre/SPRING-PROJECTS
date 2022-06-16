package com.seleniumexpress.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

	// private Heart heart = new Heart(); This is achieved using spring
	@Autowired
	@Qualifier("humanHeart")
	private Heart heart;
	
	//So no need to write setter if you are using @Autowired before the dependency

	/*public Human() {
		// TODO Auto-generated constructor stub
	}
	//Now Spring is able to create the Human object by using the default constructor. But it is not able to inject our dependency heart. So we are getting output as "you are dead"
	
	//After adding @Autowired its throwing Error creating bean with name 'human' defined in class path resource
	//For now just assume spring is not using your constructor which is Human(new Heart()) instead it's using the default Human() constructor to create Human class object.
	
	public Human(Heart heart) {
		this.heart = heart;
		System.out.println("human constr is getting called which has Heart as arg");
	}
	
	
	public void setHeart(Heart heart) {
		this.heart = heart;
		System.out.println("setter method called");
	} */

	public void startPumping() {
		if (heart != null) {
			heart.pump();
			System.out.println("name of the animal is : " + heart.getNameOfAnimal() + 
					" no of heart present : " + heart.getNoOfHeart());
		} else {
			System.out.println("you are dead");
		}
	}

}
