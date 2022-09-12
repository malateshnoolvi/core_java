package com.xworkz.daoanddto.daoimpl;

import com.xworkz.daoanddto.dao.TabletDAO;
import com.xworkz.daoanddto.dto.TabletDTO;

public class TabletDAOimpl implements TabletDAO{
	TabletDTO[] dtos=new TabletDTO[15];
	int index=0;

	@Override
	public boolean create(TabletDTO dto) {
		this.dtos[index]=dto;
		index++;
		System.out.println("tablet saved"+dto+"index"+index);
		return false;
	}

}
