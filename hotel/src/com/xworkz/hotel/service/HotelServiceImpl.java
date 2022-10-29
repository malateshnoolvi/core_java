package com.xworkz.hotel.service;

import com.xworkz.hotel.dto.HotelDTO;
import com.xworkz.hotel.repository.HotelRepository;
import com.xworkz.hotel.repository.HotelRepositoryImpl;

public class HotelServiceImpl implements HotelService {

	@Override
	public boolean validateAndSave(HotelDTO dto) {
		System.out.println("running validate and save");
		int id = dto.getId();
		String name = dto.getName();
		String ownerName = dto.getOwnerName();
		int workers = dto.getWorkers();
		String type = dto.getType();
		if (id > 0 && id < 50) {
			System.out.println("valid id");
			if (name != null && name.length() > 2 && name.length() < 30) {
				System.out.println("valid name");
				if (ownerName != null && ownerName.length() > 2 && ownerName.length() < 30) {
					System.out.println("valid ownername");
					if (workers > 2 && workers < 20) {
						System.out.println("valid workers");
						if (type != null && type == "veg" || type == "non-veg") {
							System.out.println("valid type");
							HotelRepository hotelRepository = new HotelRepositoryImpl();
							hotelRepository.save(dto);
						}
					} else {
						System.err.println("invalid workers");
					}
				} else {
					System.err.println("invalid ownername");
				}
			} else {
				System.err.println("invalid name");
			}
		} else {
			System.err.println("invalid id");
		}
		return true;
	}

}
