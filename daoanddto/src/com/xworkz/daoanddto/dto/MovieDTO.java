package com.xworkz.daoanddto.dto;

import java.io.Serializable;
import java.util.Arrays;

public class MovieDTO implements Serializable {

	private int id;
	private String movieName;
	private String heroName;
	private String heroineName;
	private double budget;
	private int noOfActors;
	private String[] producerNames;
	private String[] actorsNames;
	private double collection;
	private boolean kannadaMovie;
	private String directorName;
	private int noOfsongs;
	private boolean fanIndiaMovie;
	private String productionHouse;
	private double rating;

	public MovieDTO() {
		System.out.println("constructor of moviedto");
	}

	@Override
	public String toString() {
		return "MovieDTO [id=" + id + ", movieName=" + movieName + ", heroName=" + heroName + ", heroineName="
				+ heroineName + ", budget=" + budget + ", noOfActors=" + noOfActors + ", producerNames="
				+ Arrays.toString(producerNames) + ", actorsNames=" + Arrays.toString(actorsNames) + ", collection="
				+ collection + ", kannadaMovie=" + kannadaMovie + ", singerName=" + directorName + ", noOfsongs="
				+ noOfsongs + ", fanIndiaMovie=" + fanIndiaMovie + ", productionHouse=" + productionHouse + ", rating="
				+ rating + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getHeroName() {
		return heroName;
	}

	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}

	public String getHeroineName() {
		return heroineName;
	}

	public void setHeroineName(String heroineName) {
		this.heroineName = heroineName;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public int getNoOfActors() {
		return noOfActors;
	}

	public void setNoOfActors(int noOfActors) {
		this.noOfActors = noOfActors;
	}

	public String[] getProducerNames() {
		return producerNames;
	}

	public void setProducerNames(String[] producerNames) {
		this.producerNames = producerNames;
	}

	public String[] getActorsNames() {
		return actorsNames;
	}

	public void setActorsNames(String[] actorsNames) {
		this.actorsNames = actorsNames;
	}

	public double getCollection() {
		return collection;
	}

	public void setCollection(double collection) {
		this.collection = collection;
	}

	public boolean isKannadaMovie() {
		return kannadaMovie;
	}

	public void setKannadaMovie(boolean kannadaMovie) {
		this.kannadaMovie = kannadaMovie;
	}

	public String getDirectorName() {
		return directorName;
	}

	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}

	public int getNoOfsongs() {
		return noOfsongs;
	}

	public void setNoOfsongs(int noOfsongs) {
		this.noOfsongs = noOfsongs;
	}

	public boolean isFanIndiaMovie() {
		return fanIndiaMovie;
	}

	public void setFanIndiaMovie(boolean fanIndiaMovie) {
		this.fanIndiaMovie = fanIndiaMovie;
	}

	public String getProductionHouse() {
		return productionHouse;
	}

	public void setProductionHouse(String productionHouse) {
		this.productionHouse = productionHouse;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

}
