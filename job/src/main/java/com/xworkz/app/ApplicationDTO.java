package com.xworkz.app;

import org.apache.catalina.ant.BaseRedirectorHelperTask;

public class ApplicationDTO {

	private String name;
	private String email;
	private Long phoneNo;
	private Long altPhoneNo;
	private String gender;
	private String qualification;
	private Integer passout;
	private String university;
	private String address;
	private String skills;
	private Double salary;
	private Integer expierence;
	private String idProof;
	private Long proofNo;

	public ApplicationDTO() {
		System.out.println("default constructor of DTO");
	}

	public ApplicationDTO(String name, String email, Long phoneNo, Long altPhoneNo, String gender, String qualification,
			Integer passout, String university, String address, String skills, Double salary, Integer expierence,
			String idProof, Long proofNo) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
		this.altPhoneNo = altPhoneNo;
		this.gender = gender;
		this.qualification = qualification;
		this.passout = passout;
		this.university = university;
		this.address = address;
		this.skills = skills;
		this.salary = salary;
		this.expierence = expierence;
		this.idProof = idProof;
		this.proofNo = proofNo;
	}

	@Override
	public String toString() {
		return "ApplicationDTO [name=" + name + ", email=" + email + ", phoneNo=" + phoneNo + ", altPhoneNo="
				+ altPhoneNo + ", gender=" + gender + ", qualification=" + qualification + ", passout=" + passout
				+ ", university=" + university + ", address=" + address + ", skills=" + skills + ", salary=" + salary
				+ ", expierence=" + expierence + ", idProof=" + idProof + ", proofNo=" + proofNo + "]";
	}
	
	

}
