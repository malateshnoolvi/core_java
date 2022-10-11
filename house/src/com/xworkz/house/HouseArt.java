package com.xworkz.house;

import static com.xworkz.house.Type.*;

import java.util.ArrayList;
import java.util.List;

import static com.xworkz.house.OwingType.*;

public class HouseArt {
	public static void main(String[] args) {

		HouseDTO house = new HouseDTO(1, "sai", "manoj", Type.APPARTMENT, 6, false, OWN);
		HouseDTO house1 = new HouseDTO(2, "ram", "malatesh", Type.INDIVIDUAL, 4, true, RENT);
		HouseDTO house2 = new HouseDTO(3, "jai", "mahesh", Type.VILLA, 5, false, LEASE);
		HouseDTO house3 = new HouseDTO(4, "dev", "praveen", Type.INDIVIDUAL, 3, true, OWN);
		HouseDTO house4 = new HouseDTO(5, "om", "raghu", Type.VILLA, 6, false, RENT);
		HouseDTO house5 = new HouseDTO(6, "prabu", "ramesh", Type.APPARTMENT, 5, false, LEASE);
		HouseDTO house6 = new HouseDTO(7, "shri", "abhishek", Type.INDIVIDUAL, 4, true, OWN);
		HouseDTO house7 = new HouseDTO(8, "baba", "darshan", Type.VILLA, 5, false, RENT);
		HouseDTO house8 = new HouseDTO(9, "akash", "prajwal", Type.APPARTMENT, 6, false, LEASE);
		HouseDTO house9 = new HouseDTO(10, "venkat", "basavaraj", Type.INDIVIDUAL, 5, true, OWN);
		HouseDTO house10 = new HouseDTO(11, "teja", "sharath", Type.APPARTMENT, 3, false, RENT);
		HouseDTO house11 = new HouseDTO(12, "pavi", "nandan", Type.VILLA, 5, true, LEASE);
		HouseDTO house12 = new HouseDTO(13, "gopi", "sanjeev", Type.APPARTMENT, 5, false, OWN);
		HouseDTO house13 = new HouseDTO(14, "darma", "rajesh", Type.INDIVIDUAL, 4, true, LEASE);
		HouseDTO house14 = new HouseDTO(15, "laxman", "goutam", Type.APPARTMENT, 5, false, RENT);
		HouseDTO house15 = new HouseDTO(16, "abhi", "hanumanth", Type.VILLA, 6, true, OWN);
		HouseDTO house16 = new HouseDTO(17, "basava", "sudeep", Type.INDIVIDUAL, 3, false, LEASE);
		HouseDTO house17 = new HouseDTO(18, "shiva", "sagar", Type.APPARTMENT, 5, false, RENT);
		HouseDTO house18 = new HouseDTO(19, "madhu", "chandru", Type.VILLA, 4, true, OWN);
		HouseDTO house19 = new HouseDTO(20, "mani", "barath", Type.INDIVIDUAL, 5, false, LEASE);

		List<HouseDTO> list = new ArrayList<HouseDTO>();
		list.add(house);
		list.add(house1);
		list.add(house2);
		list.add(house3);
		list.add(house4);
		list.add(house5);
		list.add(house6);
		list.add(house7);
		list.add(house8);
		list.add(house9);
		list.add(house10);
		list.add(house11);
		list.add(house12);
		list.add(house13);
		list.add(house14);
		list.add(house15);
		list.add(house16);
		list.add(house17);
		list.add(house18);
		list.add(house19);

		System.out.println("assending order id");
		list.stream().sorted((ref, ref1) -> ref.getId().compareTo(ref1.getId()))
				.forEach((ref) -> System.out.println(ref));
		System.out.println("<=============================================>");
		System.out.println("dessending order id");
		list.stream().sorted((ref, ref1) -> ref1.getId().compareTo(ref.getId()))
				.forEach(ref -> System.out.println(ref));
		System.out.println("<=============================================>");
		System.out.println("assending order by name");
		list.stream().sorted((ref, ref1) -> ref.getName().compareTo(ref1.getName()))
				.forEach(ref -> System.out.println(ref));
		System.out.println("<=============================================>");
		System.out.println("dessending oerder by type");
		list.stream().sorted((ref, ref1) -> ref1.getType().compareTo(ref.getType()))
				.forEach(ref -> System.out.println(ref));
		System.out.println("<=============================================>");
		System.out.println("elements with loan and sort by owner dessending");
		list.stream().filter((ref) -> ref.isLoan() == true)
				.sorted((ref, ref1) -> -ref.getOwner().compareTo(ref1.getOwner()))
				.forEach(ref -> System.out.println(ref));
		System.out.println("<=============================================>");
		System.out.println("elements where owningType is lease");
		list.stream().filter((ref) -> ref.getOwingType() == OwingType.LEASE).forEach(ref -> System.out.println(ref));
		System.out.println("<=============================================>");
		System.out.println("elements where Type is appartment");
		list.stream().filter((ref) -> ref.getType() == Type.APPARTMENT).forEach(ref -> System.out.println(ref));
		System.out.println("<=============================================>");
		System.out.println("elements where Type is villa");
		list.stream().filter((ref) -> ref.getType() == Type.VILLA).forEach(ref -> System.out.println(ref));
		System.out.println("<=============================================>");
		System.out.println("element order by type and owningtype asending");
		list.stream().sorted((ref, ref1) -> {
			int m = ref.getType().compareTo(ref1.getType());
			if (m == 0) {
				return ref.getOwingType().compareTo(ref1.getOwingType());
			}
			return m;
		}).forEach(ref -> System.out.println(ref));
		System.out.println("<=============================================>");
		System.out.println("element order by name and id dessending");
		list.stream().sorted((ref, ref1) -> {
			int m = ref1.getName().compareTo(ref.getName());
			if (m == 0) {
				return ref1.getId().compareTo(ref.getId());
			}
			return m;
		}).forEach(ref -> System.out.println(ref));
		System.out.println("<=============================================>");
	}

}
