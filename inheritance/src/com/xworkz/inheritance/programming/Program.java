package com.xworkz.inheritance.programming;

public class Program {
	
	public String typeOfLaunguage="programming language";
	public String designedBy="james gosling";
	public int since=1995;
	public String firstName="Oak";
	public int noOfKeywords=52;
	
	public Program() {
		System.out.println("constructor of program");
	}
	public void torisu() {
		System.out.println(this.typeOfLaunguage);
		System.out.println(this.designedBy);
		System.out.println(this.since);
		System.out.println(this.firstName);
		System.out.println(this.noOfKeywords);
		System.out.println("======================");
	}

}
