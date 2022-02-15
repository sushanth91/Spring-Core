package com.milonsheikh.javaConfigByComponentAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {

	@Autowired
	private Principal principal;
	
	@Autowired
	private Teacher teacher;
	
	public void test() {
		principal.principalInfo();
		teacher.teach();
	}


}
