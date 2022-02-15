package com.milonsheikh.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	
	ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
    Addition addition =context.getBean("addition",Addition.class);
    addition.doSum();
	
	
	}
}
