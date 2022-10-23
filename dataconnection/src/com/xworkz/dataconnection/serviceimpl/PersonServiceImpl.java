package com.xworkz.dataconnection.serviceimpl;

import com.xworkz.dataconnection.dto.PersonDTO;
import com.xworkz.dataconnection.repository.PersonRepository;
import com.xworkz.dataconnection.repositoryimpl.PersonRepositoryImpl;
import com.xworkz.dataconnection.service.PersonService;

public class PersonServiceImpl implements PersonService {

	@Override
	public boolean validAndSave(PersonDTO dto) {
		System.out.println("running valid and save");

		int id = dto.getId();
		String name = dto.getName();
		String email = dto.getEmail();
		long mobileNo = dto.getMobileNo();
		String gender = dto.getGender();
		String qualification = dto.getQualification();
		boolean married = dto.isMarried();
		boolean working = dto.isWorking();
		String companyName = dto.getCompanyName();
		double salary = dto.getSalary();
		int age = dto.getAge();
		int experience = dto.getExperience();
		String location = dto.getLocation();
		String city = dto.getCity();
		String state = dto.getState();
		String country = dto.getCountry();
		long adharNo = dto.getAdharNo();
		String panNo = dto.getPanNo();
		boolean alive = dto.isAlive();
		long bankAcNO = dto.getBankAcNO();

		if (id > 0 && id < 500) {
			System.out.println("valid id");
			if (name != null && name.length() > 2 && name.length() < 30) {
				System.out.println("valid name");
				if (email != null && email.length() > 10 && email.length() < 40) {
					System.out.println("valid email");
					if (mobileNo > 9999999 && mobileNo != 0) {
						System.out.println("valid mobileno ");
						if (gender != null && gender == "male" || gender == "female") {
							System.out.println("valid gender");
							if (qualification != null && qualification.length() >= 2 && qualification.length() < 10) {
								System.out.println("valid qualification");
								if (married == true || married == false) {
									System.out.println("valid married type");
									if (working == true || working == false) {
										System.out.println("valid working type");
										if (companyName != null && companyName.length() > 2
												&& companyName.length() < 30) {
											System.out.println("valid company name");
											if (salary > 10000 && salary < 900000) {
												System.out.println("valid salary");
												if (age > 18 && age < 40) {
													System.out.println("valid age");
													if (experience >= 0 && experience < 20) {
														System.out.println("valid experience");
														if (location != null && location.length() > 3
																&& location.length() < 30) {
															System.out.println("valid location");
															if (city != null && city.length() > 2
																	&& city.length() < 30) {
																System.out.println("valid city");
																if (state != null && state.length() > 2
																		&& state.length() < 30) {
																	System.out.println("valid state");
																	if (country != null && country.length() > 2
																			&& country.length() < 20) {
																		System.out.println("valid country");
																		if (adharNo > 9999999) {
																			System.out.println("valid adharNo");
																			if (panNo != null && panNo.length() > 0) {
																				System.out.println("valid panNo");
																				if (alive == true) {
																					System.out.println("valid alive");
																					if (bankAcNO > 9999999) {
																						System.out.println(
																								"valid accountNo");
																						PersonRepository personRepository = new PersonRepositoryImpl();
																						personRepository.save(dto);
																						personRepository.displayAll();
																						personRepository
																								.displayAllAgeGreaterThenOrderByName(
																										age);
																						personRepository
																								.displayAllByGenderDescOrderByName(
																										gender);
																						personRepository
																								.displayAllBySalaryGreaterThanOrderByDesc(
																										salary);
																						personRepository.displatCount();
																						personRepository.displaySumOfSalary();
																						System.out.println(
																								"all data saved successfully"
																										+ dto);

																					} else {
																						System.err.println(
																								"invalid accountNo");
																					}
																				} else {
																					System.err.println("invalid alive");
																				}
																			} else {
																				System.err.println("invalid panNo");
																			}
																		} else {
																			System.err.println("invalid adharNo");
																		}
																	} else {
																		System.err.println("invalid country");
																	}
																} else {
																	System.err.println("invalid state");
																}
															} else {
																System.err.println("invalid city");
															}
														} else {
															System.err.println("invalid location");
														}
													} else {
														System.err.println("invalid experience");
													}
												} else {
													System.err.println("invalid age");
												}
											} else {
												System.err.println("invalid salary");
											}

										} else {
											System.err.println("invalid company name");
										}
									} else {
										System.err.println("invalid working type");
									}

								} else {
									System.err.println("invalid married type");
								}
							} else {
								System.err.println("invalid qualification");
							}
						} else {
							System.err.println("invalid gender");
						}
					} else {
						System.err.println("invalid mobileno");
					}
				} else {
					System.out.println("invalid email");
				}

			} else {
				System.err.println("invalid name");
			}
		} else {
			System.err.println("invalid id");
		}
		return false;

	}

	@Override
	public void displayAll() {
		System.out.println("running diplayall method");
		PersonRepositoryImpl impl = new PersonRepositoryImpl();
		impl.displayAll();

	}

	@Override
	public void displayAllAgeGreaterThenOrderByName(int age1) {
		System.out.println("display All Age Greater Then OrderBy Name");
		PersonRepositoryImpl personRepositoryImpl = new PersonRepositoryImpl();
		personRepositoryImpl.displayAllAgeGreaterThenOrderByName(age1);

	}

	@Override
	public void displayAllByGenderDescOrderByName(String gdr) {
		System.out.println("display All By Gender Desinding Order By Name");
		PersonRepositoryImpl personRepositoryImpl1 = new PersonRepositoryImpl();
		personRepositoryImpl1.displayAllByGenderDescOrderByName(gdr);

	}

	@Override
	public void displayAllBySalaryGreaterThanOrderByDesc(double slry) {
		System.out.println("display All By Salary Greater Than OrderBy Desc");
		PersonRepository personRepository = new PersonRepositoryImpl();
		personRepository.displayAllBySalaryGreaterThanOrderByDesc(slry);
	}

	@Override
	public void displatCount() {
		System.out.println("display count method");
		PersonRepository personRepository = new PersonRepositoryImpl();
		personRepository.displatCount();
	}

	@Override
	public void displaySumOfSalary() {
		System.out.println("display sum of salary");
		PersonRepository personRepository = new PersonRepositoryImpl();
		personRepository.displaySumOfSalary();
	}
}
