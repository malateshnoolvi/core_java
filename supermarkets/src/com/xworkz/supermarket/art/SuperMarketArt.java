package com.xworkz.supermarket.art;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.supermarket.dto.SuperMarketDTO;
import com.xworkz.supermarket.service.SuperMarketService;
import com.xworkz.supermarket.service.SuperMarketServiceImpl;

public class SuperMarketArt {

	public static void main(String[] args) {

		SuperMarketDTO dto1 = new SuperMarketDTO(1, "D mart super market", "Avenue supermarts lmtd", "08AABJM035IHLZ6",
				560041, "grocery items");
		SuperMarketDTO dto2 = new SuperMarketDTO(2, "Family super market", "family company", "09ACBJM046INKZ5", 560048,
				"fruits and vegitables");
		SuperMarketDTO dto3 = new SuperMarketDTO(3, "Amazon super market", "amazon company ", "10AVCJN047IHLZ7", 560478,
				"groceries");
		SuperMarketDTO dto4 = new SuperMarketDTO(4, "More super market", "aditya birla retail lmtd", "18CABJM035IHLW8",
				580654, "fruits");
		SuperMarketDTO dto5 = new SuperMarketDTO(5, "Relience market", "relience retail ventures lmtd",
				"09AVBJM035IHGR9", 554014, "digital");
		SuperMarketDTO dto6 = new SuperMarketDTO(6, "big market", "danish ventures lmtd", "11ACBGM035IHGR2", 550021,
				"cloaths");
		SuperMarketDTO dto7 = new SuperMarketDTO(7, "mega market", "mahesh and group company", "07AXBGM075FHGD6",
				580032, "gloceries");

		SuperMarketService service = new SuperMarketServiceImpl();
		System.out.println(service.validateAndSave(dto1));
		System.out.println(service.validateAndSave(dto2));
		System.out.println(service.validateAndSave(dto3));
		System.out.println(service.validateAndSave(dto4));
		System.out.println(service.validateAndSave(dto5));
		System.out.println("<====================================>");
		List<SuperMarketDTO> dtos = new ArrayList<>();
		dtos.add(dto6);
		dtos.add(dto7);
		dtos.stream().forEach(ref -> System.out.println(service.validateAndSave(ref)));
		System.out.println("<====================================>");
		service.displayByName("Relience market");
	}

}
