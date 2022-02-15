package com.milonsheikh.SpEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

	@Value("#{22+11}")
	private int x;

	@Value("#{20+10}")
	private int y;

	@Value("#{ T(java.lang.Math).sqrt(144) }")
	private double z;

	@Value("#{ T(java.lang.Math).PI }")
	private double pi;

	@Value("#{ new java.lang.String('Milon Sheikh') }")
	private String name;
	
	@Value("#{9-6>5}")
	private boolean isActive;

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public void setPi(double pi) {
		this.pi = pi;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", pi=" + pi + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}

}
