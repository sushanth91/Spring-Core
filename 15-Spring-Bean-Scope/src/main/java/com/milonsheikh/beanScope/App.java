package com.milonsheikh.beanScope;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		HelloWorld objA =context.getBean("singletonscope",HelloWorld.class);
		System.out.println("*********SINGLETON SCOPE************");
		objA.setMessage("Message by object A");
		objA.setDate(new Date());
		System.out.println("Your Message : " + objA.getMessage());
		System.out.println("Date : " + objA.getDate().toString());

		HelloWorld objB =context.getBean("singletonscope",HelloWorld.class);
		System.out.println("Your Message : " + objB.getMessage());
		System.out.println("Date : " + objB.getDate().toString());
		System.out.println("********************************");

		HelloWorld objC = context.getBean("prototypescope",HelloWorld.class);
		System.out.println("*********PROTOTYPE SCOPE************");
		objC.setMessage("Message by object C");
		objC.setDate(new Date());
		System.out.println("Your Message : " + objC.getMessage());
		System.out.println("Date : " + objC.getDate().toString());

		HelloWorld objD =context.getBean("prototypescope",HelloWorld.class);
		System.out.println("Your Message : " + objD.getMessage());
		System.out.println("Your Date : " + objD.getDate());

		System.out.println("********************************");

	}
}
