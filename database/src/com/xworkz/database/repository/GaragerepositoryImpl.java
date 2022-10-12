package com.xworkz.database.repository;

import com.xworkz.database.dto.GarageDTO;

public class GaragerepositoryImpl implements GarageRepository {

	@Override
	public boolean save(GarageDTO garageDTO) {
		System.out.println("running save method");
		return false;
	}

}
