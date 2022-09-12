package com.xworkz.daoanddto.daoimpl;

import com.xworkz.daoanddto.dao.AlcoholDAO;
import com.xworkz.daoanddto.dto.AlcoholDTO;

public class AlcoholDAOimpl implements AlcoholDAO {

	private AlcoholDTO[] alcohol = new AlcoholDTO[15];
	private int index=0;

	@Override
	public boolean create(AlcoholDTO dto) {
		this.alcohol[index]=dto;
		index++;
		System.out.println("alcohol saved"+dto+" "+"index"+this.index);
		return true;
	}

}
