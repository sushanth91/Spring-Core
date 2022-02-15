package com.milonsheikh.commonAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages="com.milonsheikh.commonAnnotations")
@PropertySource("classpath:college-info.properties")
public class CollegeConfig {
	
//	@Bean
//	public Principal principalBean() {
//		return new Principal();
//	}
//	
//	@Bean
//	public Teacher mathTeacherBean() {
//		return new MathTeacher();
//	}
//
//	@Bean
//	public College collegeBean() {
//		College college = new College(principalBean()); By constructor 
//		College college = new College();
//		college.setPrincipal(principalBean());
//		college.setTeacher(mathTeacherBean());
//		return college;
//	}

}
