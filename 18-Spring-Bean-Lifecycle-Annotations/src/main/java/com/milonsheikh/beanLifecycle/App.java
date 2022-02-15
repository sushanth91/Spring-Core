package com.milonsheikh.beanLifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
	      AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

	      HelloWorld hello =context.getBean("hello",HelloWorld.class);
	      hello.getMessage();
	      context.registerShutdownHook();
	}
}
