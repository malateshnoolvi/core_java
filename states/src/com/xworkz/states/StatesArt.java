package com.xworkz.states;

import java.lang.reflect.Array;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class StatesArt {

	public static void main(String[] args) {

		ArrayList<String> list= new ArrayList<String>();
		
		list.add("Karnataka");
		list.add("TamilNadu");
		list.add("AndraPradesh");
		list.add("Kerala");
		list.add("Telangana");
		list.add("Gujrat");
		list.add("Rajasthan");
		list.add("Panjab");
		list.add("Odisa");
		list.add("Bihar");
		list.add("Assam");
		list.add("UttarPradesh");
		list.add("MadyaPradesh");
		list.add("Maharastra");
		list.add("Goa");
		list.add("Delhi");
		list.add("ArunachalPradesh");
		list.add("Meghalaya");
		list.add("Manipur");
		list.add("Sikkim");
		list.add("Chattisgarh");
		list.add("Hriyana");
		list.add("Mizoram");
		list.add("Jharkhand");
		list.add("HimachalPradesh");
		list.add("Tripura");
		list.add("Uttarakhand");
		list.add("WestBengal");
		list.add("Nagaland");
		list.add("");
		
		list.stream().forEach(ref->System.out.println(ref));
		System.out.println("<=======================>");
		list.stream().filter((ref)->ref.endsWith("a")).forEach(ref->System.out.println(ref));
		System.out.println("<=======================>");
		list.stream().filter(ref->ref.startsWith("K")).forEach(ref->System.out.println(ref));
		System.out.println("<=======================>");
		list.stream().filter(ref->ref.contains("L")).forEach(ref->System.out.println(ref));
		System.out.println("<=======================>");
		list.stream().filter(ref->ref.contains("D")).forEach(ref->System.out.println(ref));
		System.out.println("<=======================>");
		list.stream().filter(ref->ref.contains("R")).forEach(ref->System.out.println(ref));
		System.out.println("<=======================>");
		list.stream().filter(ref->ref.contains("h")).forEach(ref->System.out.println(ref));
		System.out.println("<=======================>");
		list.stream().filter(ref->ref.length()>10).forEach(ref->System.out.println(ref));
		System.out.println("<=======================>");
		list.stream().filter(ref->ref.length()<5).forEach(ref->System.out.println(ref));
		System.out.println("<=======================>");
		list.stream().forEach(ref->System.out.println(ref.toUpperCase()));
		System.out.println("<=======================>");
		list.stream().forEach(ref->System.out.println(ref.toLowerCase()));
		System.out.println("<=======================>");
		list.stream().forEach(ref->{ StringBuilder bldr=new StringBuilder();
		bldr.append(ref).reverse();System.out.println(bldr);});
		System.out.println("<=======================>");
	
		}
}
