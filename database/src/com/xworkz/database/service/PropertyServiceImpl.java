package com.xworkz.database.service;

import com.xworkz.database.dto.PropertyDTO;
import com.xworkz.database.repository.PropertyRepository;
import com.xworkz.database.repository.PropertyRepositoryImpl;

public class PropertyServiceImpl implements PropertyService {
	public PropertyServiceImpl() {
		System.out.println("created" + getClass().getSimpleName());
	}

	@Override
	public boolean validatrAndSave(PropertyDTO dto) {
		System.out.println("running valid and save");
		String ownerName = dto.getOwnerName();
		int money = dto.getMoney();
		int noOfBikes = dto.getNoOfBikes();
		int noOfCars = dto.getNoOfCars();
		boolean house = dto.isHouse();
		boolean land = dto.isLand();
		if (ownerName != null && ownerName.length() > 3 && ownerName.length() < 30) {
			System.out.println("owner name is valid");
			if (money > 200000 && money < 1000000) {
				System.out.println("valid money");
				if (noOfBikes > 1 && noOfBikes < 10) {
					System.out.println("valid bike nors");
					if(noOfCars>1 && noOfCars<10) {
						System.out.println("valid car nors");
						if(house==true) {
							System.out.println("house is there");
							if(land==true) {
								System.out.println("land is there");
								System.out.println("All properties are saved successfully-"+dto);
								PropertyRepository repository = new PropertyRepositoryImpl();
								repository.save(dto);
							}else {
								System.err.println("land is not there");
							}
						}
						else {
							System.err.println("house is not there");
						}
					}else {
						System.err.println("invalid car nors");
					}

				} else {
					System.err.println("invalid bike nors");
				}
			} else {
				System.err.println("invalid money");
			}
		} else {
			System.err.println( "invalid owner name");
		}
		return false;

	}

}
