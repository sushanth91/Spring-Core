package com.milonsheikh.javaConfigByBeanAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CollegeConfig {
	
	@Bean
	public Principal principalBean() {
		return new Principal();
	}
	
	@Bean
	public Teacher mathTeacherBean() {
		return new MathTeacher();
	}

	@Bean
	public College collegeBean() {
//		College college = new College(principalBean(),mathTeacherBean());// By constructor 
		
		College college = new College(); // By Setter
		college.setPrincipal(principalBean());
		college.setTeacher(mathTeacherBean());
		return college;
	}

}
