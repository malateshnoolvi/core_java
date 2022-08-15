package com.xworkz.inheritance.actor;

public class Actor {
	
	public String actorName;
	public double  actorHeight;
	public int noOfMovie;
	public int noofAwards;
	public String biridu;
	
	
	public Actor( String actorName, double  actorHeight, int noOfMovie, int noofAwards,String biridu) {
		System.out.println("costructor of actor");
		
		this.actorHeight=actorHeight;
		this.actorName=actorName;
		this.noOfMovie=noOfMovie;
		this.noofAwards=noofAwards;
		this.biridu=biridu;
	}

	public void torisu() {
		System.out.println(this.actorName);
		System.out.println(this.actorHeight);
		System.out.println(this.noOfMovie);
		System.out.println(this.noofAwards);
		System.out.println(this.biridu);
		System.out.println("===================");
	}
}
