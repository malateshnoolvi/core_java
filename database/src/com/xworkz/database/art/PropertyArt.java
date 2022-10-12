package com.xworkz.database.art;

import com.xworkz.database.dto.PropertyDTO;
import com.xworkz.database.service.PropertyService;
import com.xworkz.database.service.PropertyServiceImpl;

public class PropertyArt {

	public static void main(String[] args) {
   
		PropertyDTO dto = new PropertyDTO("Mahesh", 600000, 4, 5,true, true);
		System.out.println(dto);
		
		PropertyService service=new PropertyServiceImpl();
		service.validatrAndSave(dto);
	}

}
