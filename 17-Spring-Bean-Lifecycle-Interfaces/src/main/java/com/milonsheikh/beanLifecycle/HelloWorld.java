package com.milonsheikh.beanLifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HelloWorld implements InitializingBean, DisposableBean{
	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	public void getMessage() {
		System.out.println("Your Message : " + message);
	}

	public void afterPropertiesSet() throws Exception {
		 System.out.println("Bean is going through init using interfaceas");
	}

	public void destroy() throws Exception {
		 System.out.println("Bean will destroy now using interfaceas");
	}

}
