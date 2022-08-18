package com.xworkz.inheritance1.touchpadkeyboard;

public class TouchpadArt {

	public static void main(String[] args) {

		Touchpad touchpad = new Touchpad("dell", true, "window10");
		touchpad.torisu();

		Keyboard keyboard = new Touchpad("hp", false, "window10");
		Touchpad converted = (Touchpad) keyboard;
		converted.price = 2547;
		converted.color = "gray";
		converted.noOfKeys = 104;
		converted.torisu();

	}

}
