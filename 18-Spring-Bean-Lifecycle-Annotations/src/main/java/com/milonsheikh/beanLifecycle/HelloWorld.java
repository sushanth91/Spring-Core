package com.milonsheikh.beanLifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class HelloWorld {
	private String message;

	public HelloWorld() {

	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void getMessage() {
		System.out.println("Your Message : " + message);
	}
	
	@PostConstruct
	public void start() {
		System.out.println("starting mathod");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("ending mathod");
	}

}
