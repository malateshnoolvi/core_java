package com.xworkz.database.art;

import com.xworkz.database.dto.ProjectorDTO;
import com.xworkz.database.service.ProjectorService;
import com.xworkz.database.service.ProjectorServiceImpl;

public class ProjectorArt {

	public static void main(String[] args) {

		ProjectorDTO dto = new ProjectorDTO("Canon", 13520,"Black","DLP projector", 0.40);
		System.out.println(dto);

		ProjectorService service = new ProjectorServiceImpl();
		service.validateAndSave(dto);
	}

}
