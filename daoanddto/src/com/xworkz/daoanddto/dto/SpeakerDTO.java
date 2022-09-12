package com.xworkz.daoanddto.dto;

public class SpeakerDTO {

	private String speakerCompany;
	private String speakerColor;
	private boolean bluetooth;
	private double speakerPrice;
	private String speakerShape;
	private int volumeRange;
	private boolean usbConecter;
	private int warrantyInMonths;
	private boolean homeAppliences;
	private boolean bass;
	private int noOfSpeakers;
	private boolean remote;
	private boolean lighting;
	private boolean fm;
	private boolean hardSound;
	
	public SpeakerDTO() {
	}

	@Override
	public String toString() {
		return "SpeakerDTO [speakerCompany=" + speakerCompany + ", speakerColor=" + speakerColor + ", bluetooth="
				+ bluetooth + ", speakerPrice=" + speakerPrice + ", speakerShape=" + speakerShape + ", volumeRange="
				+ volumeRange + ", usbConecter=" + usbConecter + ", warrantyInMonths=" + warrantyInMonths
				+ ", homeAppliences=" + homeAppliences + ", bass=" + bass + ", noOfSpeakers=" + noOfSpeakers
				+ ", remote=" + remote + ", lighting=" + lighting + ", fm=" + fm + ", hardSound=" + hardSound + "]";
	}

	public String getSpeakerCompany() {
		return speakerCompany;
	}

	public void setSpeakerCompany(String speakerCompany) {
		this.speakerCompany = speakerCompany;
	}

	public String getSpeakerColor() {
		return speakerColor;
	}

	public void setSpeakerColor(String speakerColor) {
		this.speakerColor = speakerColor;
	}

	public boolean isBluetooth() {
		return bluetooth;
	}

	public void setBluetooth(boolean bluetooth) {
		this.bluetooth = bluetooth;
	}

	public double getSpeakerPrice() {
		return speakerPrice;
	}

	public void setSpeakerPrice(double speakerPrice) {
		this.speakerPrice = speakerPrice;
	}

	public String getSpeakerShape() {
		return speakerShape;
	}

	public void setSpeakerShape(String speakerShape) {
		this.speakerShape = speakerShape;
	}

	public int getVolumeRange() {
		return volumeRange;
	}

	public void setVolumeRange(int volumeRange) {
		this.volumeRange = volumeRange;
	}

	public boolean isUsbConecter() {
		return usbConecter;
	}

	public void setUsbConecter(boolean usbConecter) {
		this.usbConecter = usbConecter;
	}

	public int getWarrantyInMonths() {
		return warrantyInMonths;
	}

	public void setWarrantyInMonths(int warrantyInMonths) {
		this.warrantyInMonths = warrantyInMonths;
	}

	public boolean isHomeAppliences() {
		return homeAppliences;
	}

	public void setHomeAppliences(boolean homeAppliences) {
		this.homeAppliences = homeAppliences;
	}

	public boolean isBass() {
		return bass;
	}

	public void setBass(boolean bass) {
		this.bass = bass;
	}

	public int getNoOfSpeakers() {
		return noOfSpeakers;
	}

	public void setNoOfSpeakers(int noOfSpeakers) {
		this.noOfSpeakers = noOfSpeakers;
	}

	public boolean isRemote() {
		return remote;
	}

	public void setRemote(boolean remote) {
		this.remote = remote;
	}

	public boolean isLighting() {
		return lighting;
	}

	public void setLighting(boolean lighting) {
		this.lighting = lighting;
	}

	public boolean isFm() {
		return fm;
	}

	public void setFm(boolean fm) {
		this.fm = fm;
	}

	public boolean isHardSound() {
		return hardSound;
	}

	public void setHardSound(boolean hardSound) {
		this.hardSound = hardSound;
	}
	
	

}
