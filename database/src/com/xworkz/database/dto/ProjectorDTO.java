package com.xworkz.database.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ProjectorDTO {

	private String company;
	private int prize;
	private String color;
	private String type;
	private double projectionDistance;

}
