package com.xworkz.daoanddto.daoimpl;

import com.xworkz.daoanddto.dao.MovieDAO;
import com.xworkz.daoanddto.dto.MovieDTO;

public class MovieDAOimpl implements MovieDAO {

	private MovieDTO[] movies = new MovieDTO[15];
	private int index = 0;

	@Override
	public boolean create(MovieDTO dto) {
		this.movies[index] = dto;
		this.index++;
		System.out.println("movie is saved"+dto+" "+"int index"+this.index);
		return true;
	}

}
