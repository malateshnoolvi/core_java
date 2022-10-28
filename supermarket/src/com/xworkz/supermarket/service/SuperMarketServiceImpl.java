package com.xworkz.supermarket.service;

import java.security.Provider.Service;
import java.util.List;

import com.xworkz.supermarket.dto.SuperMarketDTO;
import com.xworkz.supermarket.repository.SuperMarketRepository;
import com.xworkz.supermarket.repository.SuperMarketRepositoryImpl;

public class SuperMarketServiceImpl implements SuperMarketService {

	@Override
	public boolean validateAndSave(SuperMarketDTO dto) {
		System.out.println("validate and save method");
		int id = dto.getId();
		String name = dto.getName();
		String company = dto.getCompany();
		String gstNo = dto.getGstNo();
		int pincode = dto.getPincode();
		String type = dto.getType();

		if (id != 0 && id > 0 && id < 100) {
			System.out.println("valid id");
			if (name != null && name.length() > 2 && name.length() < 30) {
				System.out.println("valid name");
				if (company != null && company.length() > 3 && company.length() < 30) {
					System.out.println("valid company");
					if (gstNo != null && gstNo.length() == 15) {
						System.out.println("valid gst number");
						if (pincode != 0 && pincode > 0 && pincode < 999999) {
							System.out.println("valid pincode");
							if (type != null && type.length() > 2 && type.length() < 30) {
								System.out.println("valid type");
								SuperMarketRepository superMarketRepository = new SuperMarketRepositoryImpl();
								superMarketRepository.save(dto);
							} else {
								System.err.println("invalid type");
							}
						} else {
							System.err.println("invalid pincode");
						}
					} else {
						System.err.println("invalid gst number");
					}
				} else {
					System.err.println("invalid company");
				}
			} else {
				System.err.println("invalid name");
			}
		} else {
			System.err.println("invalid id");
		}
		return true;
	}

	@Override
	public boolean validateAndSave(List<SuperMarketDTO> list) {
		SuperMarketRepository repository=new SuperMarketRepositoryImpl();
		repository.save(list);
		
		return true;
	}

	@Override
	public void displayByName(String name) {
		SuperMarketRepository repository =new SuperMarketRepositoryImpl();
		repository.displayByName(name);

	}

}
