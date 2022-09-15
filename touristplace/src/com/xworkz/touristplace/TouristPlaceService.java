package com.xworkz.touristplace;

import com.xworkz.touristplace.exception.InvalidTouristPlaceException;

public interface TouristPlaceService {
	
	boolean validateAndSave(String place) throws InvalidTouristPlaceException;

}
