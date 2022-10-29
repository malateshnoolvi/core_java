package com.xworkz.hotel.dto;

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
public class HotelDTO {

	private int id;
	private String name;
	private String ownerName;
	private int workers;
	private String type;
}
