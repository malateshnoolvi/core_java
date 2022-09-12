package com.xworkz.daoanddto.dto;

import java.io.Serializable;

public class ApartmentDTO implements Serializable{
	
	private String apartmentName;
	private int noOfFloors;
	private int apartmentLength;
	private int apartmentWidth;
	private boolean parking;
	private int noOfFlats;
	private boolean garden;
	private boolean lift;
	private int costPerFlat;
	private boolean security;
	private boolean swimmingPool;
	private boolean camera;
	private int lifeSpan;
	private boolean solar;
	private boolean wifi;
	
	public ApartmentDTO() {
		
	}

	@Override
	public String toString() {
		return "ApartmentDTO [apartmentName=" + apartmentName + ", noOfFloors=" + noOfFloors + ", apartmentLength="
				+ apartmentLength + ", apartmentWidth=" + apartmentWidth + ", parking=" + parking + ", noOfFlats="
				+ noOfFlats + ", garden=" + garden + ", lift=" + lift + ", costPerFlat=" + costPerFlat + ", security="
				+ security + ", swimmingPool=" + swimmingPool + ", camera=" + camera + ", lifeSpan=" + lifeSpan
				+ ", solar=" + solar + ", wifi=" + wifi + "]";
	}

	public String getApartmentName() {
		return apartmentName;
	}

	public void setApartmentName(String apartmentName) {
		this.apartmentName = apartmentName;
	}

	public int getNoOfFloors() {
		return noOfFloors;
	}

	public void setNoOfFloors(int noOfFloors) {
		this.noOfFloors = noOfFloors;
	}

	public int getApartmentLength() {
		return apartmentLength;
	}

	public void setApartmentLength(int apartmentLength) {
		this.apartmentLength = apartmentLength;
	}

	public int getApartmentWidth() {
		return apartmentWidth;
	}

	public void setApartmentWidth(int apartmentWidth) {
		this.apartmentWidth = apartmentWidth;
	}

	public boolean isParking() {
		return parking;
	}

	public void setParking(boolean parking) {
		this.parking = parking;
	}

	public int getNoOfFlats() {
		return noOfFlats;
	}

	public void setNoOfFlats(int noOfFlats) {
		this.noOfFlats = noOfFlats;
	}

	public boolean isGarden() {
		return garden;
	}

	public void setGarden(boolean garden) {
		this.garden = garden;
	}

	public boolean isLift() {
		return lift;
	}

	public void setLift(boolean lift) {
		this.lift = lift;
	}

	public int getCostPerFlat() {
		return costPerFlat;
	}

	public void setCostPerFlat(int costPerFlat) {
		this.costPerFlat = costPerFlat;
	}

	public boolean isSecurity() {
		return security;
	}

	public void setSecurity(boolean security) {
		this.security = security;
	}

	public boolean isSwimmingPool() {
		return swimmingPool;
	}

	public void setSwimmingPool(boolean swimmingPool) {
		this.swimmingPool = swimmingPool;
	}

	public boolean isCamera() {
		return camera;
	}

	public void setCamera(boolean camera) {
		this.camera = camera;
	}

	public int getLifeSpan() {
		return lifeSpan;
	}

	public void setLifeSpan(int lifeSpan) {
		this.lifeSpan = lifeSpan;
	}

	public boolean isSolar() {
		return solar;
	}

	public void setSolar(boolean solar) {
		this.solar = solar;
	}

	public boolean isWifi() {
		return wifi;
	}

	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}
	
	
	

}
