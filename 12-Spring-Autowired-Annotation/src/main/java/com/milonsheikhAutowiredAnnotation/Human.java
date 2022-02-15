package com.milonsheikhAutowiredAnnotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {
	private Heart heart;
	
	public Human() {

	}

//	@Autowired
	public Human(Heart heart) {
		this.heart = heart;
		System.out.println("Human constructor called");
	}
	
	@Autowired
	public void setHeart(Heart heart) {
		this.heart = heart;
		System.out.println("Setter called");
	}

	public void startPumping() {
		if(heart !=null) {
			heart.pump();
		}else {
			System.out.println("You are dead");
		}
	}
}
