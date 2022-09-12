package com.xworkz.daoanddto.daoimpl;

import com.xworkz.daoanddto.dao.ApartmentDAO;
import com.xworkz.daoanddto.dto.ApartmentDTO;

public class ApartmentDAOimpl implements ApartmentDAO {

	ApartmentDTO[] apartment = new ApartmentDTO[15];
	int index = 0;

	@Override
	public boolean create(ApartmentDTO dto) {
		this.apartment[index] = dto;
		index++;
		System.out.println("apartment saved" + dto + "index" + this.index);
		return false;
	}

}
