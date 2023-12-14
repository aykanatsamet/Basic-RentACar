package com.rent;

public class Customer {
	private String name,ehliyet;
	
	public Customer(String name,String ehliyet) {
		this.name=name;
		this.ehliyet=ehliyet.toUpperCase();
		
	}
	

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEhliyet() {
		return ehliyet;
	}

	public void setEhliyet(String ehliyet) {
		this.ehliyet = ehliyet;
	}


}
