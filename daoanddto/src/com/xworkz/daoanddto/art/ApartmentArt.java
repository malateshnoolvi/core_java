package com.xworkz.daoanddto.art;

import com.xworkz.daoanddto.dao.ApartmentDAO;
import com.xworkz.daoanddto.daoimpl.ApartmentDAOimpl;
import com.xworkz.daoanddto.dto.ApartmentDTO;

public class ApartmentArt {

	public static void main(String[] args) {

		ApartmentDTO dto = new ApartmentDTO();
		dto.setApartmentLength(80);
		dto.setApartmentName("shri");
		dto.setApartmentWidth(60);
		dto.setCamera(true);
		dto.setCostPerFlat(28);
		dto.setGarden(true);
		dto.setLifeSpan(70);
		dto.setLift(true);
		dto.setNoOfFlats(12);
		dto.setNoOfFloors(4);
		dto.setParking(true);
		dto.setSecurity(true);
		dto.setSolar(true);
		dto.setSwimmingPool(false);

		ApartmentDAO dao = new ApartmentDAOimpl();
		dao.create(dto);
	}

}
