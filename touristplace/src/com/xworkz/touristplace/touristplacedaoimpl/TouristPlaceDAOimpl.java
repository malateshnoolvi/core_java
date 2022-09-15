package com.xworkz.touristplace.touristplacedaoimpl;

import com.xworkz.touristplace.touristplacedao.TouristPlaceDAO;

public class TouristPlaceDAOimpl implements TouristPlaceDAO {

	private String[] dataStore = new String[10];
	private int index;

	@Override
	public boolean save(String place) {
		this.dataStore[index] = place;
		//System.out.println("saved name is" + place + " " + "index" + index);
		this.index++;
		System.out.println("saved name is" + place + " " + "index" +this.index);
		return false;
	}

	@Override
	public boolean checkPlaceName(String place) {
		for (String ref : this.dataStore)
			if (ref != null && ref.equals(place)) {
				return true;

			}
		return false;
		
	}

}
