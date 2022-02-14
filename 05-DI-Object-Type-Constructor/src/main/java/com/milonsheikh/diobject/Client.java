package com.milonsheikh.diobject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	public static void main(String[] args) {

		ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("beans.xml file loded");
        Student student= context.getBean("stu",Student.class);
        student.cheating();
        
        AnotherStudent anotherStudent= context.getBean("anotherStudent",AnotherStudent.class);
        anotherStudent.startCheating();
		
	}

}
