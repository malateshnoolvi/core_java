package com.xworkz.daoanddto.daoimpl;

import com.xworkz.daoanddto.dao.SpeakerDAO;
import com.xworkz.daoanddto.dto.SpeakerDTO;

public class SpeakerDAOimpl implements SpeakerDAO {
	SpeakerDTO[] speaker=new SpeakerDTO[15];
	int index =0;

	@Override
	public boolean create(SpeakerDTO dto) {
		this.speaker[index]=dto;
		index++;
		System.out.println("speaker saved"+dto+" "+"index"+index);
		return true;
	}

}
 