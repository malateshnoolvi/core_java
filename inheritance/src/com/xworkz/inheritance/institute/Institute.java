package com.xworkz.inheritance.institute;

public class Institute {
	
	public String instituteName="xworkz";
	public int noOfTrainees=210;
	public int noOfStaff=10;
	public String mainBranchIn="Rajajinagar";
	public String nameOfTrainer="Omakar sir";
	
	
	 public Institute() {
		System.out.println("constructor of institute");
	}
	 public void torisu() {
		 System.out.println(this.instituteName);
		 System.out.println(this.noOfTrainees);
		 System.out.println(this.noOfStaff);
		 System.out.println(this.mainBranchIn);
		 System.out.println(this.nameOfTrainer);
		 System.out.println("=====================");
	 }

}
