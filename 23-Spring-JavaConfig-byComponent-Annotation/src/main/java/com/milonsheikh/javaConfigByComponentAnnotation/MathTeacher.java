package com.milonsheikh.javaConfigByComponentAnnotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements Teacher {

	public void teach() {

		System.out.println("Hi I am your math teacher");

	}

}
