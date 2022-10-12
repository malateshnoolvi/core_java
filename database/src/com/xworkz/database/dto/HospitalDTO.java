package com.xworkz.database.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class HospitalDTO {

	private int id;
	private String name;
	private String founder;
	private String specialist;
	private int since;

}
