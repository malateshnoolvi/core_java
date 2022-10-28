package com.xworkz.supermarket.repository;

import java.util.List;

import com.xworkz.supermarket.dto.SuperMarketDTO;

public interface SuperMarketRepository {
	
	boolean save(SuperMarketDTO dto);
	
	boolean save(List<SuperMarketDTO> list);
	
	void displayByName(String name);
	

}
