package com.milonsheikh.dicollection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {
	private String name;
	private List<String> phones;
	private Set<String> adderss;
	private Map<String, String> courses;
	private Properties props;

	

	public Student(String name, List<String> phones, Set<String> adderss, Map<String, String> courses,
			Properties props) {

		this.name = name;
		this.phones = phones;
		this.adderss = adderss;
		this.courses = courses;
		this.props = props;
	}



	public void displayStudentInfo() {
      System.out.println(name);
      System.out.println(phones);
      System.out.println(adderss);
      System.out.println(courses);
      System.out.println(props);
	}

}
