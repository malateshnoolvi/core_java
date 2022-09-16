package com.xworkz.primeminister.primeministerdaoimpl;

import com.xworkz.primeminister.exception.InvalidIndexException;
import com.xworkz.primeminister.primeministerdao.PrimeMinisterDAO;

public class PrimeMinisterDAOimpl implements PrimeMinisterDAO {
	private String[] dataStore = new String[5];
	private int index;

	@Override
	public boolean save(String name) throws InvalidIndexException {
		if (this.index > this.dataStore.length) {
			System.out.println("name is stored it's in the rang");
			this.dataStore[index] = name;
			this.index++;

			// System.out.println("name is stored it's in the range");
		} else {
			throw new InvalidIndexException("index is out of range");
		}

		return false;
	}

	@Override
	public boolean checkName(String name) {
		for (String ref : dataStore) {
			if (ref != null && ref.equals(name))
				return true;

		}
		return false;
	}

}
