package com.xworkz.hotel.art;

import com.xworkz.hotel.dto.HotelDTO;
import com.xworkz.hotel.service.HotelService;
import com.xworkz.hotel.service.HotelServiceImpl;

public class HotelArt {

	public static void main(String[] args) {

		HotelDTO dto1=new HotelDTO(1, "udupi hotel", "shrinath", 15, "veg");
		HotelDTO dto2=new HotelDTO(2, "taj hotel", "ameer", 18, "non-veg");
		HotelDTO dto3=new HotelDTO(3, "gokul hotel", "darshan", 14, "veg");
		HotelDTO dto4=new HotelDTO(4, "savaji hotel", "gopal", 16, "non-veg");
		HotelDTO dto5=new HotelDTO(5, "basava hotel", "basavaraj", 17, "veg");
		
		HotelService service=new HotelServiceImpl();
	    service.validateAndSave(dto1);
	    service.validateAndSave(dto2);
	    service.validateAndSave(dto3);
	    service.validateAndSave(dto4);
	    service.validateAndSave(dto5);
	    
		
	}

}
