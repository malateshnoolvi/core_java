package com.xworkz.touristplace.touristplacedao;

public interface TouristPlaceDAO {

	boolean save(String place);

	boolean checkPlaceName(String place);

}
