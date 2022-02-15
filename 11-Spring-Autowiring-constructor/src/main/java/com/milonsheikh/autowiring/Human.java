package com.milonsheikh.autowiring;

public class Human {
	private Heart heart;

	public Human(Heart heart) {
		this.heart = heart;
		System.out.println("Human constructor called");
	}

	public void startPumping() {
		if(heart !=null) {
			heart.pump();
		}else {
			System.out.println("You are dead");
		}
	}
}
