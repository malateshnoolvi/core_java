package com.xworkz.touristplace.touristplaceart;

import com.xworkz.touristplace.TouristPlaceService;
import com.xworkz.touristplace.TouristPlaceServiceimpl;
import com.xworkz.touristplace.exception.InvalidTouristPlaceException;
import com.xworkz.touristplace.touristplacedao.TouristPlaceDAO;
import com.xworkz.touristplace.touristplacedaoimpl.TouristPlaceDAOimpl;

public class TouristPlaceArt {

	public static void main(String[] args) {

		TouristPlaceDAO dao = new TouristPlaceDAOimpl();

		TouristPlaceService placeService = new TouristPlaceServiceimpl(dao);

		try {
			placeService.validateAndSave("Hampi");
			placeService.validateAndSave("Dandeli");
			placeService.validateAndSave("JogFalls");
			placeService.validateAndSave("Munnar");
			placeService.validateAndSave("Manali");
			placeService.validateAndSave("Mysore");
			placeService.validateAndSave("Coorg");
			placeService.validateAndSave("Mullayanagiri");
		} catch (InvalidTouristPlaceException itpe) {

			System.out.println(itpe.getMessage());
			System.out.println(itpe.getClass());
	

		}
	}

}
