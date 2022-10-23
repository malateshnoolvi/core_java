package com.xworkz.dataconnection.constant1;

import lombok.Getter;

@Getter
public enum MysqlConstant {

	URL("jdbc:mysql://Localhost:3306/jdbc"), DONTSEE("Xworkzodc@123"), NAME("root");

	private String value;

	private MysqlConstant(String value) {
		this.value = value;
	}

}
