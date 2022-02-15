package com.milonsheikh.dicollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=
				new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("beans.xml file load");
		Student student=context.getBean("student",Student.class);
		student.displayStudentInfo();


	}

}
