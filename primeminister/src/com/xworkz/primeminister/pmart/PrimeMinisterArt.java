package com.xworkz.primeminister.pmart;

import com.xworkz.primeminister.exception.InvalidIndexException;
import com.xworkz.primeminister.exception.InvalidPrimeMinisterException;
import com.xworkz.primeminister.primeministerdao.PrimeMinisterDAO;
import com.xworkz.primeminister.primeministerdaoimpl.PrimeMinisterDAOimpl;
import com.xworkz.primeminister.primeministerservice.PrimeMinisterService;
import com.xworkz.primeminister.primeministerserviceimpl.PrimeMinisterServiceimpl;

public class PrimeMinisterArt {

	public static void main(String[] args) {

		PrimeMinisterDAO dao=new PrimeMinisterDAOimpl();
		
		PrimeMinisterService serviceimpl = new PrimeMinisterServiceimpl(dao);
		try {
			serviceimpl.validateAndSave("Narendra Modi");
			serviceimpl.validateAndSave("Jawahar lal Nehru");
			serviceimpl.validateAndSave("ManmohanSingh");
			serviceimpl.validateAndSave("Indira Gandhi");
			serviceimpl.validateAndSave("Morarji Desai");
			serviceimpl.validateAndSave("Rajiv Gandhi");
		}
		catch(InvalidPrimeMinisterException ipme) {
		System.out.println(ipme.getMessage());
		}
		
		catch(InvalidIndexException e){
		System.out.println(e.getMessage());
		}
}
}

