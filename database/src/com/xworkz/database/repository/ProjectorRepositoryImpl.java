package com.xworkz.database.repository;

import com.xworkz.database.dto.ProjectorDTO;

public class ProjectorRepositoryImpl implements ProjectorRepository {

	@Override
	public boolean save(ProjectorDTO dto) {
		System.out.println("running save method");
		return false;
	}

}
