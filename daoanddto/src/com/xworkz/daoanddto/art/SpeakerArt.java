package com.xworkz.daoanddto.art;

import com.xworkz.daoanddto.dao.SpeakerDAO;
import com.xworkz.daoanddto.daoimpl.SpeakerDAOimpl;
import com.xworkz.daoanddto.dto.SpeakerDTO;

public class SpeakerArt {

	public static void main(String[] args) {

		SpeakerDTO dto=new SpeakerDTO();
		dto.setBass(true);
		dto.setBluetooth(true);
		dto.setFm(true);
		dto.setHardSound(false);
		dto.setHomeAppliences(true);
		dto.setLighting(false);
		dto.setNoOfSpeakers(0);
		dto.setRemote(true);
		dto.setSpeakerColor("black");
		dto.setSpeakerCompany("sony");
		dto.setSpeakerPrice(2500);
		dto.setSpeakerShape("rectangular");
		dto.setUsbConecter(true);
		dto.setVolumeRange(100);
		dto.setWarrantyInMonths(20);
		
		SpeakerDAO dao=new SpeakerDAOimpl();
		dao.create(dto);
		
	}

}
