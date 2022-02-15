package com.milonsheikh.javaConfigByBeanAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class College {

	private Principal principal;

	private Teacher teacher;
	
//	public College(Principal principal, Teacher teacher) {
//		super();
//		this.principal = principal;
//		this.teacher = teacher;
//	}



	public void test() {
		principal.principalInfo();
		teacher.teach();
	}

	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}


}
