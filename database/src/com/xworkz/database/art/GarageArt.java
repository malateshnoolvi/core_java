package com.xworkz.database.art;

import com.xworkz.database.dto.GarageDTO;
import com.xworkz.database.repository.GaragerepositoryImpl;
import com.xworkz.database.service.GarageService;
import com.xworkz.database.service.GarageServiceImpl;

public class GarageArt {
	public static void main(String[] args) {

		GarageDTO dto = new GarageDTO("DevuGarage", "Darshan", 6,true, "bike");
		System.out.println(dto);

		GarageService garageServiceImpl = new GarageServiceImpl();
		garageServiceImpl.validateAndSave(dto);

	}
}