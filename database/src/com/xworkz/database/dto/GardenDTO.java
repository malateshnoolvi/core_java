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
public class GardenDTO {

	private String name;
	private int areaInSqm;
	private int noOfChairs;
	private int noOfTrees;
	private boolean maintainance;
}
