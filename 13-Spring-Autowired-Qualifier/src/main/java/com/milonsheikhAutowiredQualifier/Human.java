package com.milonsheikhAutowiredQualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	@Autowired
	@Qualifier("humnaHeart")
	private Heart heart;

	public void startPumping() {
		if(heart !=null) {
			System.out.println("Name of animal is "+heart.getNameOfAnimal());
			System.out.println("No of heat is "+heart.getNoOfHeart());
			
			heart.pump();
		}else {
			System.out.println("You are dead");
		}
	}
}
