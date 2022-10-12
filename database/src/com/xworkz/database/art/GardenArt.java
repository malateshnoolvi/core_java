package com.xworkz.database.art;

import com.xworkz.database.dto.GardenDTO;
import com.xworkz.database.service.GardenService;
import com.xworkz.database.service.GardenServiceImpl;

public class GardenArt {

	public static void main(String[] args) {

		GardenDTO gardenDTO =new GardenDTO("BrundaGarden", 1287, 6, 40, true);
		System.out.println(gardenDTO);
		GardenService service = new GardenServiceImpl();
		service.validateAndSave(gardenDTO);
	}

}
