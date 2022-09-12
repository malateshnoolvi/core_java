package com.xworkz.daoanddto.art;

import com.xworkz.daoanddto.dao.TabletDAO;
import com.xworkz.daoanddto.daoimpl.TabletDAOimpl;
import com.xworkz.daoanddto.dto.TabletDTO;

public class TabletArt {

	public static void main(String[] args) {

		TabletDTO dto=new TabletDTO();
		dto.setCompany("Micro labs");
		dto.setDrugContent(10);
		dto.setExpiryDate(2022);
		dto.setHarmFull(false);
		dto.setManufacturedDate(2021);
		dto.setNoOfTabletInStrip(10);
		dto.setSweet(false);
		dto.setTabletColor("white");
		dto.setTabletName("Dolo 650");
		dto.setTabletPrice(2);
		dto.setTabletShape("circle");
		dto.setThickness(3);
		dto.setTypeOfpacking("strip box");
		dto.setWeightInMg(20);
		
		TabletDAO dao=new TabletDAOimpl();
		dao.create(dto);
	}

}
