package com.milonsheikh.valueRequired;

public class Student {
	private String name;
	private String interestedCourse;
	private String hobby;

	public void setName(String name) {
		this.name = name;
	}

	public void setInterestedCourse(String interestedCourse) {
		this.interestedCourse = interestedCourse;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	
	public void displayStudentInfo(){
		System.out.println("Student name is "+name);
		System.out.println("Student interested course is "+interestedCourse);
		System.out.println("Student hobby is"+hobby);
	}
}
