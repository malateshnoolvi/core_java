package com.xworkz.inheritance.glass;

public class Glass {

	public int mirrorPrice = 250;
	public double mirrorSize = 4;
	public String mirrorShape = "Rectangular";
	public String mirrorColor = "Gray";
    public String mirrorFrame="Plasic";

	public Glass() {
		System.out.println("constructor of glass");
	}
    public void torisu() {
    	System.out.println(this.mirrorPrice);
    	System.out.println(this.mirrorSize);
    	System.out.println(this.mirrorShape);
    	System.out.println(this.mirrorColor);
    	System.out.println(this.mirrorFrame);
    	System.out.println("======================");
    }

}
