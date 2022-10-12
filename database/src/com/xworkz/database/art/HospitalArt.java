package com.xworkz.database.art;

import com.xworkz.database.dto.HospitalDTO;
import com.xworkz.database.service.HospitalService;
import com.xworkz.database.service.HospitalServiceImpl;

public class HospitalArt {

	public static void main(String[] args) {

		HospitalDTO hospitalDTO = new HospitalDTO(1, "Jaydeva", "C N Manjunath", "Cardiac", 1872);
		System.out.println(hospitalDTO);
		HospitalService hospitalService = new HospitalServiceImpl();
		hospitalService.validateAndSave(hospitalDTO);
	}

}
