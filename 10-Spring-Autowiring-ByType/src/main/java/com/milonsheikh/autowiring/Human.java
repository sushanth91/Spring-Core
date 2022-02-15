package com.milonsheikh.autowiring;

public class Human {
	private Heart heart;

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
