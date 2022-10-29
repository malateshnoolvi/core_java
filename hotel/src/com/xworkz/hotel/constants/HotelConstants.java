package com.xworkz.hotel.constants;

import lombok.Getter;
import lombok.Setter;

@Getter
public enum HotelConstants {

	URL("jdbc:mysql://Localhost:3306/jdbc"), DONTSEE("Xworkzodc@123"), NAME("root");

	private String value;

	private HotelConstants(String value) {
		this.value = value;
	}

}
