package com.milonsheikh.springIoc;

public class Airtel implements simCard {

	public Airtel() {
		System.out.println("Airtel Class Called \n");
	}

	public void calling() {
		System.out.println("Calling Using Airtel Sim");

	}

	public void data() {
		System.out.println("Browing Internet Using Airtel Sim");

	}

}
