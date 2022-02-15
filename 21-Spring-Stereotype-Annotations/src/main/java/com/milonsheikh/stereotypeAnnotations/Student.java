package com.milonsheikh.stereotypeAnnotations;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	@Value("Milon Sheikh")
	private String studentName;
	@Value("Dhaka")
	private String city;

//	@Value("Milon Sheikh")
//	public void setStudentName(String studentName) {
//		this.studentName = studentName;
//	}
//
//	@Value("Dhaka")
//	public void setCity(String city) {
//		this.city = city;
//	}

	public void displayStudentInfo(){
		System.out.println("Student name is "+studentName);
		System.out.println("Student interested city is "+city);
	}
}
