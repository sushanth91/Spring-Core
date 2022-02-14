package com.milonsheikh.diliteral;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Student stu1=context.getBean("student1",Student.class);		
		stu1.displayStudentInfo();
	
		Student stu2=context.getBean("student2",Student.class);		
		stu2.displayStudentInfo();
	}
	
}
