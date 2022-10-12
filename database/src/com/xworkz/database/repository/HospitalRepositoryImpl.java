package com.xworkz.database.repository;

import com.xworkz.database.dto.HospitalDTO;

public class HospitalRepositoryImpl implements HospitalRepository {

	public HospitalRepositoryImpl() {
		System.out.println("created" + getClass().getSimpleName());
	}

	@Override
	public boolean save(HospitalDTO dto) {
		System.out.println("running save method");
		return true;
	}

}
