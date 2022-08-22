package com.xworkz.cricket;

public class OneDayCricket extends Cricket {

	public String bestBowler;
	public String bestBatsman;

	public void setBestBowler(String bestBowler) {
		this.bestBowler = bestBowler;
		System.out.println("best bowler in  OneDayCricket");
	}

	public void setBestBatsman(String bestBatsman) {
		this.bestBatsman = bestBatsman;
		System.out.println("best batsman in  OneDayCricket");
	}

	public String manOfSeries() {
		System.out.println("man of series in  OneDayCricket");
		return "Virat Kohli";
	}

	@Override
	public double presentation() {
		System.out.println("presentation in OneDayCricket");
		return 5000000;
	}

	@Override
	public boolean entertainment() {
		System.out.println("is there entertainment in  OneDayCricket");
		return true;
	}

}
