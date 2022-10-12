package com.xworkz.database.service;

import com.xworkz.database.dto.GardenDTO;
import com.xworkz.database.repository.GardenRepository;
import com.xworkz.database.repository.GardenRepositoryImpl;

public class GardenServiceImpl implements GardenService {

	public GardenServiceImpl() {
		System.out.println("created" + getClass().getSimpleName());
	}

	@Override
	public boolean validateAndSave(GardenDTO dto) {
		System.out.println("running valid and save");
		String name = dto.getName();
		int areaInSqm = dto.getAreaInSqm();
		int noOfChairs = dto.getNoOfChairs();
		int noOfTrees = dto.getNoOfTrees();
		boolean maintainance = dto.isMaintainance();
		if (name != null && name.length() > 5 && name.length() < 50) {
			System.out.println("name is valid");
			if (areaInSqm < 400 && areaInSqm > 10000) {
				System.out.println("valid area");
				if (noOfChairs > 5 && noOfChairs < 20) {
					System.out.println("chairNo is valid");
					if (noOfTrees > 10 && noOfTrees < 50) {
						System.out.println("treenNo is valid");
						if (maintainance == true) {
							System.out.println("garden is maintained");
							System.out.println("all properties are saved successefully" + dto);
							GardenRepository repository = new GardenRepositoryImpl();
							repository.save(dto);
						} else {
							System.err.println("garden is not maintained");
						}

					} else {
						System.err.println("treenNo is invalid");
					}
				} else {
					System.err.println("chairNo is invalid");
				}
			} else {
				System.err.println("invalid area");
			}
		} else {
			System.err.println("name is invalid");
		}
		return true;
	}

}
