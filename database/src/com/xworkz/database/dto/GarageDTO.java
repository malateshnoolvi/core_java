package com.xworkz.database.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class GarageDTO {
	private String name;
	private String ownerName;
	private int noOfWorkers;
	private boolean service;
	private String type;

}
