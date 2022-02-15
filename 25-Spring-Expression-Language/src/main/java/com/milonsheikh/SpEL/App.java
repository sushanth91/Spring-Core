package com.milonsheikh.SpEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
		Demo demo=context.getBean("demo",Demo.class);
		System.out.println(demo);

		
	}
}
