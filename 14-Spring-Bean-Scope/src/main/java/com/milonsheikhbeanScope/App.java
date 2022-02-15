package com.milonsheikhbeanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
		HelloMessage hello1=context.getBean("hello",HelloMessage.class);
		hello1.setMessage("Hello World");
		System.out.println(hello1.getMessage());
		
		
		HelloMessage hello2=context.getBean("hello",HelloMessage.class);
		System.out.println(hello2.getMessage());


	}
}
