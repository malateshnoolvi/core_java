package com.xworkz.house;

public enum OwingType {

	RENT("Rent"), LEASE("Lease"), OWN("Own");

	private String type;

	private OwingType(String type) {
		this.type = type;
	}

	private String getType() {
		return type;

	}
}