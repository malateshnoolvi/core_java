package com.xworkz.house;

public class HouseDTO {

	private Integer id;
	private String name;
	private String owner;
	private Type type;
	private Integer noOfFloors;
	private boolean loan;
	private OwingType owingType;

	public HouseDTO() {
		System.out.println("created constructor of houseDTO");
	}

	public HouseDTO(Integer id, String name, String owner, Type type, Integer noOfFloors, boolean loan,
			OwingType owingType) {
		super();
		this.id = id;
		this.name = name;
		this.owner = owner;
		this.type = type;
		this.noOfFloors = noOfFloors;
		this.loan = loan;
		this.owingType = owingType;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Integer getNoOfFloors() {
		return noOfFloors;
	}

	public void setNoOfFloors(Integer noOfFloors) {
		this.noOfFloors = noOfFloors;
	}

	public boolean isLoan() {
		return loan;
	}

	public void setLoan(boolean loan) {
		this.loan = loan;
	}

	public OwingType getOwingType() {
		return owingType;
	}

	public void setOwingType(OwingType owingType) {
		this.owingType = owingType;
	}

	@Override
	public String toString() {
		return "HouseDTO [id=" + id + ", name=" + name + ", owner=" + owner + ", type=" + type + ", noOfFloors="
				+ noOfFloors + ", loan=" + loan + ", owingType=" + owingType + "]";
	}

}
