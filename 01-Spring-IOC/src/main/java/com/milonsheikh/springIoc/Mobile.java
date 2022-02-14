package com.milonsheikh.springIoc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		
         ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml ");
		simCard mysim = context.getBean("sim1", simCard.class);
		
		mysim.calling();
		mysim.data();

	}

}
