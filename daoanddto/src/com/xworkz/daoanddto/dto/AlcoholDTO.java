package com.xworkz.daoanddto.dto;

import java.io.Serializable;

public class AlcoholDTO implements Serializable {

	private String alcoholName;
	private String type;
	private int alcoholInMl;
	private double alcoholPrice;
	private String alcoholcolor;
	private double alcoholContent;
	private boolean sweet;
	private boolean odour;
	private boolean acidic;
	private boolean liquid;
	private boolean solubleInWater;
	private double pHValue;
	private double acoholTax;
	private String madeIn;
	private String packedIn;

	public AlcoholDTO() {
		System.out.println("constructor of alcoholdto");
	}

	@Override
	public String toString() {
		return "AlcoholDTO [alcoholName=" + alcoholName + ", brand=" + type + ", alcoholInMl=" + alcoholInMl
				+ ", alcoholPrice=" + alcoholPrice + ", alcoholcolor=" + alcoholcolor + ", alcoholContent="
				+ alcoholContent + ", sweet=" + sweet + ", odour=" + odour + ", acidic=" + acidic + ", liquid=" + liquid
				+ ", solubleInWater=" + solubleInWater + ", pHValue=" + pHValue + ", acoholTax=" + acoholTax
				+ ", madeIn=" + madeIn + ", packedIn=" + packedIn + "]";
	}

	public String getAlcoholName() {
		return alcoholName;
	}

	public void setAlcoholName(String alcoholName) {
		this.alcoholName = alcoholName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAlcoholInMl() {
		return alcoholInMl;
	}

	public void setAlcoholInMl(int alcoholInMl) {
		this.alcoholInMl = alcoholInMl;
	}

	public double getAlcoholPrice() {
		return alcoholPrice;
	}

	public void setAlcoholPrice(double alcoholPrice) {
		this.alcoholPrice = alcoholPrice;
	}

	public String getAlcoholcolor() {
		return alcoholcolor;
	}

	public void setAlcoholcolor(String alcoholcolor) {
		this.alcoholcolor = alcoholcolor;
	}

	public double getAlcoholContent() {
		return alcoholContent;
	}

	public void setAlcoholContent(double alcoholContent) {
		this.alcoholContent = alcoholContent;
	}

	public boolean isSweet() {
		return sweet;
	}

	public void setSweet(boolean sweet) {
		this.sweet = sweet;
	}

	public boolean isOdour() {
		return odour;
	}

	public void setOdour(boolean odour) {
		this.odour = odour;
	}

	public boolean isAcidic() {
		return acidic;
	}

	public void setAcidic(boolean acidic) {
		this.acidic = acidic;
	}

	public boolean isLiquid() {
		return liquid;
	}

	public void setLiquid(boolean liquid) {
		this.liquid = liquid;
	}

	public boolean isSolubleInWater() {
		return solubleInWater;
	}

	public void setSolubleInWater(boolean solubleInWater) {
		this.solubleInWater = solubleInWater;
	}

	public double getpHValue() {
		return pHValue;
	}

	public void setpHValue(double pHValue) {
		this.pHValue = pHValue;
	}

	public double getAcoholTax() {
		return acoholTax;
	}

	public void setAcoholTax(double acoholTax) {
		this.acoholTax = acoholTax;
	}

	public String getMadeIn() {
		return madeIn;
	}

	public void setMadeIn(String madeIn) {
		this.madeIn = madeIn;
	}

	public String getPackedIn() {
		return packedIn;
	}

	public void setPackedIn(String packedIn) {
		this.packedIn = packedIn;
	}

}
