package com.xworkz.award.service;

import com.xworkz.award.entity.KRAwardeesEntity;
import com.xworkz.award.repository.KRAwardeesRepository;
import com.xworkz.award.repository.KRAwardeesRepositoryImpl;

public class KRAwardeesServiceImpl implements KRAwardeesService {

	KRAwardeesRepository repository=new KRAwardeesRepositoryImpl();

	@Override
	public boolean validateAndSave(KRAwardeesEntity dto) {
		System.out.println("running validate and save method");
		int id = dto.getId();
		String name = dto.getName();
		int year = dto.getYear();
		String achievement = dto.getAchievement();
		boolean alive = dto.isAlive();
		int age = dto.getAge();
		String place = dto.getPlace();
		if (id > 0 && id < 20) {
			System.out.println("valid id");
			if (name != null && name.length() > 3 && name.length() < 30) {
				System.out.println("valid name");
				if (year > 1991 && year < 2023) {
					System.out.println("valid year");
					if (achievement != null && achievement.length() > 3 && achievement.length() < 30) {
						System.out.println("valid achievement");
						if (alive == true || alive == false) {
							System.out.println("valid alive");
							if (age > 40 && age < 115) {
								System.out.println("valid age");
								if (place != null && place.length() > 3 && place.length() < 20) {
									System.out.println("valid place");

									 this.repository.save(dto);
								} else {
									System.err.println("invalid place");
								}
							} else {
								System.err.println("invalid age");
							}

						} else {
							System.err.println("invalid alive");
						}
					} else {
						System.err.println("invalid achievement");
					}
				} else {
					System.err.println("invalid year");
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
