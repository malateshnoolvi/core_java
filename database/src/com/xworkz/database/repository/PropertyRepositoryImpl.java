package com.xworkz.database.repository;

import com.xworkz.database.dto.PropertyDTO;

public class PropertyRepositoryImpl implements PropertyRepository {

	public PropertyRepositoryImpl() {
		System.out.println("created" + getClass().getSimpleName());
	}

	@Override
	public boolean save(PropertyDTO dto) {
		System.out.println("running save method");
		return false;
	}

}
