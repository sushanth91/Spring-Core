package com.milonsheikh.diliteral;

public class Student {
	private int studentId;
	private String studentName;
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
		System.out.println("Setter setStudentId");
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
		System.out.println("Setter studentName");
	}

	public void displayStudentInfo() {
	System.out.println("Student ID is "+studentId+" and name is " + studentName);
	}

}
