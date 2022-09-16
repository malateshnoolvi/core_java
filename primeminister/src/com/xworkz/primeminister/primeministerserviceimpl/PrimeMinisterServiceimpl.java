package com.xworkz.primeminister.primeministerserviceimpl;

import com.xworkz.primeminister.exception.InvalidPrimeMinisterException;
import com.xworkz.primeminister.primeministerdao.PrimeMinisterDAO;
import com.xworkz.primeminister.primeministerservice.PrimeMinisterService;

public class PrimeMinisterServiceimpl implements PrimeMinisterService {

	private PrimeMinisterDAO dao;

	public PrimeMinisterServiceimpl(PrimeMinisterDAO dao) {
		this.dao = dao;
		System.out.println("constructor of pmsi");
	}

	@Override
	public boolean validateAndSave(String name) throws InvalidPrimeMinisterException {
		if (name != null && name.length() > 2 && name.length() < 30) {
			System.out.println("name is not null and pm name is-" + name);
			if (!dao.checkName(name)) {
				System.out.println("name is exist-" + name);
				return this.dao.save(name);
			} else {
				System.out.println("name is not exist and saved");
				throw new InvalidPrimeMinisterException("name is not exist and saved");
			}
		} else {
			System.out.println("name is equal to null and it's not valid-" + name);
			throw new InvalidPrimeMinisterException("name is equal to null and it's not valid-" + name);
		}
	}
}
