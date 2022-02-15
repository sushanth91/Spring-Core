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

	public void setName(String name) {
		this.name = name;
	}

	public void setPhones(List<String> phones) {
		this.phones = phones;
	}

	public void setAdderss(Set<String> adderss) {
		this.adderss = adderss;
	}

	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	
	public void setProps(Properties props) {
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
