package com.milonsheikh.diobject;

public class Student {
	private int id;
	private MathCheat mathCheat;
	
	public Student(int id, MathCheat mathCheat) {
		this.id = id;
		this.mathCheat = mathCheat;
	}

	public void cheating() {
		mathCheat.matheCheat();
		System.out.println("My id is "+id);
	}
	

}
