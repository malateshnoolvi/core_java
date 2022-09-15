package com.xworkz.touristplace;

import com.xworkz.touristplace.exception.InvalidTouristPlaceException;
import com.xworkz.touristplace.touristplacedao.TouristPlaceDAO;

public class TouristPlaceServiceimpl implements TouristPlaceService {

	private TouristPlaceDAO dao;

	public TouristPlaceServiceimpl(TouristPlaceDAO dao) {
		this.dao = dao;
		System.out.println("constructor of touristplaceserviceimpl");
	}

	@Override
	public boolean validateAndSave(String place) throws InvalidTouristPlaceException {
		if (place != null && place.length() > 2 && place.length() < 10) {
			System.out.println("place is valid-" + place);
			if (!dao.checkPlaceName(place)) {
				//System.out.println("place is already exist-" + place);
				return this.dao.save(place);

			} else {
				System.out.println("place is saved");
				throw new InvalidTouristPlaceException("place is duplicate");

			}
		} else {
			System.err.println("place is not saved");
			throw new InvalidTouristPlaceException("place is invalid-" + place);
		}
	}
}
// return false;
