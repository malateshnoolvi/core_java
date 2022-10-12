package com.xworkz.database.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PropertyDTO {

	private String ownerName;
	private int money;
	private int noOfBikes;
	private int noOfCars;
	private boolean house;
	private boolean land;

}
