package com.xworkz.daoanddto.dto;

public class TabletDTO {

	private String tabletName;
	private String company;
	private String typeOfpacking;
	private int tabletPrice;
	private double weightInMg;
	private double thickness;
	private String tabletShape;
	private String tabletColor;
	private int noOfTabletInStrip;
	private boolean sweet;
	private int drugContent;
	private int manufacturedDate;
	private boolean harmFull;
	private int expiryDate;

	public TabletDTO() {
		System.out.println("constructor of tabletdto");
	}

	@Override
	public String toString() {
		return "TabletDTO [tabletName=" + tabletName + ", company=" + company + ", typeOfpacking=" + typeOfpacking
				+ ", tabletPrice=" + tabletPrice + ", weightInMg=" + weightInMg + ", thickness=" + thickness
				+ ", tabletShape=" + tabletShape + ", tabletColor=" + tabletColor + ", noOfTabletInStrip="
				+ noOfTabletInStrip + ", sweet=" + sweet + ", drugContent=" + drugContent + ", manufacturedDate="
				+ manufacturedDate + ", harmFull=" + harmFull + ", expiryDate=" + expiryDate + "]";
	}

	public String getTabletName() {
		return tabletName;
	}

	public void setTabletName(String tabletName) {
		this.tabletName = tabletName;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getTypeOfpacking() {
		return typeOfpacking;
	}

	public void setTypeOfpacking(String typeOfpacking) {
		this.typeOfpacking = typeOfpacking;
	}

	public int getTabletPrice() {
		return tabletPrice;
	}

	public void setTabletPrice(int tabletPrice) {
		this.tabletPrice = tabletPrice;
	}

	public double getWeightInMg() {
		return weightInMg;
	}

	public void setWeightInMg(double weightInMg) {
		this.weightInMg = weightInMg;
	}

	public double getThickness() {
		return thickness;
	}

	public void setThickness(double thickness) {
		this.thickness = thickness;
	}

	public String getTabletShape() {
		return tabletShape;
	}

	public void setTabletShape(String tabletShape) {
		this.tabletShape = tabletShape;
	}

	public String getTabletColor() {
		return tabletColor;
	}

	public void setTabletColor(String tabletColor) {
		this.tabletColor = tabletColor;
	}

	public int getNoOfTabletInStrip() {
		return noOfTabletInStrip;
	}

	public void setNoOfTabletInStrip(int noOfTabletInStrip) {
		this.noOfTabletInStrip = noOfTabletInStrip;
	}

	public boolean isSweet() {
		return sweet;
	}

	public void setSweet(boolean sweet) {
		this.sweet = sweet;
	}

	public int getDrugContent() {
		return drugContent;
	}

	public void setDrugContent(int drugContent) {
		this.drugContent = drugContent;
	}

	public int getManufacturedDate() {
		return manufacturedDate;
	}

	public void setManufacturedDate(int manufacturedDate) {
		this.manufacturedDate = manufacturedDate;
	}

	public boolean isHarmFull() {
		return harmFull;
	}

	public void setHarmFull(boolean harmFull) {
		this.harmFull = harmFull;
	}

	public int getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(int expiryDate) {
		this.expiryDate = expiryDate;
	}
	

}
