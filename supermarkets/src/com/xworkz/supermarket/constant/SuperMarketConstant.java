package com.xworkz.supermarket.constant;

import lombok.Getter;

@Getter
public enum SuperMarketConstant {
	
	URL("jdbc:mysql://Localhost:3306/jdbc"), DONTSEE("Xworkzodc@123"), NAME("root");

	private String value;

	private  SuperMarketConstant(String value) {
		this.value = value;
	}

}
