package com.xworkz.house;

public enum Type {

	APPARTMENT("Appartment"), INDIVIDUAL("Individual"), VILLA("Villa");

	private String type;

	private Type(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
		
	}

}
