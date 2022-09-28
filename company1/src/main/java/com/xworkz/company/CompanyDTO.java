package com.xworkz.company;

import java.io.Serializable;

public class CompanyDTO implements Serializable {

	private String name;
	private String founderName;
	private String since;
	private String employees;
	private String address;
	private String bisiness;

	public CompanyDTO() {
		System.out.println("created companydto cunstructor");
	}

	public CompanyDTO(String name, String founderName, String since, String employees, String address,
			String bisiness) {
		super();
		this.name = name;
		this.founderName = founderName;
		this.since = since;
		this.employees = employees;
		this.address = address;
		this.bisiness = bisiness;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFounderName() {
		return founderName;
	}

	public void setFounderName(String founderName) {
		this.founderName = founderName;
	}

	public String getSince() {
		return since;
	}

	public void setSince(String since) {
		this.since = since;
	}

	public String getEmployees() {
		return employees;
	}

	public void setEmployees(String employees) {
		this.employees = employees;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBisiness() {
		return bisiness;
	}

	public void setBisiness(String bisiness) {
		this.bisiness = bisiness;
	}

	@Override
	public String toString() {
		return "CompanyDTO [name=" + name + ", founderName=" + founderName + ", since=" + since + ", employees="
				+ employees + ", address=" + address + ", bisiness=" + bisiness + "]";
	}

	
	
}
