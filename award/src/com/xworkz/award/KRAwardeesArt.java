package com.xworkz.award;

import com.xworkz.award.entity.KRAwardeesEntity;
import com.xworkz.award.service.KRAwardeesService;
import com.xworkz.award.service.KRAwardeesServiceImpl;

public class KRAwardeesArt {

	public static void main(String[] args) {

		
		KRAwardeesEntity awardeesDTO1=new KRAwardeesEntity(1, "Kuvempu", 1992, "Literature", false, 89 , "Kupalli");
		KRAwardeesEntity awardeesDTO2=new KRAwardeesEntity(2, "Dr.Rajkumar", 1992, "Cinema", false, 76 , "Gajanur");
		KRAwardeesEntity awardeesDTO3=new KRAwardeesEntity(3, "S.Nijalingappa", 1999, "politics", false,97  , "Halavagalu");
		KRAwardeesEntity awardeesDTO4=new KRAwardeesEntity(4, "C.N.Rao", 2000, "Science", true, 90 , "Mysore");
		KRAwardeesEntity awardeesDTO5=new KRAwardeesEntity(5, "Dr.D.P.Shetty", 2001, "Medical", true, 69 , "Kinnigoli");
		KRAwardeesEntity awardeesDTO6=new KRAwardeesEntity(6, "Bhimsen Joshi", 2005, "Music", false, 88 , "Ron,Gadag");
		KRAwardeesEntity awardeesDTO7=new KRAwardeesEntity(7, "Shri.Sri Shivakumara Swamiji", 2007, "Social Service", false, 111 , "Veerapur");
		KRAwardeesEntity awardeesDTO8=new KRAwardeesEntity(8, "Dr.J.Javaregowda", 2008, "Education and Literature", false, 100 , "Chakkere");
		KRAwardeesEntity awardeesDTO9=new KRAwardeesEntity(9, "Dr.Virendra Hegde", 2009, "Social Service", true, 73 , "Bantwal");
		KRAwardeesEntity awardeesDTO10=new KRAwardeesEntity(10, "Dr.Puneeth Rajkumar", 2022, "Cinema and Social Service", false, 45 , "Madras");
	
		KRAwardeesService service =new KRAwardeesServiceImpl();
		service.validateAndSave(awardeesDTO1);
		service.validateAndSave(awardeesDTO2);
		service.validateAndSave(awardeesDTO3);
		service.validateAndSave(awardeesDTO4);
		service.validateAndSave(awardeesDTO5);
		service.validateAndSave(awardeesDTO6);
		service.validateAndSave(awardeesDTO7);
		service.validateAndSave(awardeesDTO8);
		service.validateAndSave(awardeesDTO9);
		service.validateAndSave(awardeesDTO10);
		
	}

}
