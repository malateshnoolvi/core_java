package com.xworkz.inheritance;

import com.xworkz.inheritance.actor.Sudeep;
import com.xworkz.inheritance.alchohol.Beer;
import com.xworkz.inheritance.browser.Browser;
import com.xworkz.inheritance.cycle.Bike;
import com.xworkz.inheritance.glass.Glass;
import com.xworkz.inheritance.institute.Xworkz;
import com.xworkz.inheritance.monkey.Man;
import com.xworkz.inheritance.plane.Helicopter;
import com.xworkz.inheritance.programming.Java;
import com.xworkz.inheritance.rubber.Ball;
import com.xworkz.inheritance.wood.Bat;

public class MetroArt {

	public static void main(String[] args) {

		Metro metro = new Metro();
		metro.torisu();
		Bike bike = new Bike();
		bike.torisu();
		Browser browser=new Browser();
		browser.torisu();
		Helicopter heli = new Helicopter();
		heli.torisu();
        Bat bat=new Bat();
        bat.torisu();
        Glass glass=new Glass();
        glass.torisu();
        Man man =new Man();
        man.torisu();
        Xworkz xworkz=new Xworkz();
        xworkz.torisu();
        Java java=new Java();
        java.torisu();
        Sudeep sudeep=new Sudeep();
        sudeep.torisu();
        Ball ball=new Ball();
        ball.torisu();
        Beer beer=new Beer();
        beer.torisu();

	}

}
