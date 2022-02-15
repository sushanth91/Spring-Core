package com.milonsheikh.valueRequired;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	@Value("${student.name}")
	private String name;
	private String interestedCourse;
	private String hobby;

	@Value("Java")
	public void setInterestedCourse(String interestedCourse) {
		this.interestedCourse = interestedCourse;
	}

	@Value("Cricket")
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	public void displayStudentInfo(){
		System.out.println("Student name is "+name);
		System.out.println("Student interested course is "+interestedCourse);
		System.out.println("Student hobby is "+hobby);
	}
}
