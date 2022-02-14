package com.milonsheikh.diliteral;

public class Student {
	private int studentId;
	private String studentName;
	

	public Student(int studentId) {
		this.studentId = studentId;
	}



	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}



	public void displayStudentInfo() {
	System.out.println("Student ID is "+studentId+" and name is " + studentName);
	}

}
