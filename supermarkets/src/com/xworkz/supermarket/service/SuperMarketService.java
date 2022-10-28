package com.xworkz.supermarket.service;

import java.util.List;

import com.xworkz.supermarket.dto.SuperMarketDTO;

public interface SuperMarketService {

	boolean validateAndSave(SuperMarketDTO dto);
	
	boolean validateAndSave(List<SuperMarketDTO> list);
	
	void displayByName(String name);
}
