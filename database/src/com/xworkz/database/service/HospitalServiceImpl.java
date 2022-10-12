package com.xworkz.database.service;

import com.xworkz.database.dto.HospitalDTO;
import com.xworkz.database.repository.HospitalRepository;
import com.xworkz.database.repository.HospitalRepositoryImpl;

public class HospitalServiceImpl implements HospitalService {

	public HospitalServiceImpl() {
		System.out.println("created" + getClass().getSimpleName());
	}

	@Override
	public boolean validateAndSave(HospitalDTO dto) {
		System.out.println("running validate and save");
		int id = dto.getId();
		String name = dto.getName();
		String founder = dto.getFounder();
		String specialist = dto.getSpecialist();
		int since = dto.getSince();
		if (id > 0 && id < 50000) {
			System.out.println("id is valid");
			if (name != null && name.length() > 5 && name.length() < 50) {
				System.out.println("name is valid");
				if (founder != null && founder.length() > 3 && founder.length() < 50) {
					System.out.println("founder is valid");
					if (specialist != null && specialist.length() > 3 && specialist.length() < 50) {
						System.out.println("valid specialist name");
						if (since > 1900 && since < 2023) {
							System.out.println("since is valid");
							System.out.println("all properties are valid and saved"+dto);
							HospitalRepository repository = new HospitalRepositoryImpl();
							repository.save(dto);
						} else {
							System.err.println("since is invalid");
						}
					} else {
						System.err.println("invalid specialist name");
					}
				} else {
					System.err.println("founder is invalid");
				}
			} else {
				System.err.println("name is invalid");
			}
		} else {
			System.err.println("id is invalid");
		}
		return false;

	}

}
