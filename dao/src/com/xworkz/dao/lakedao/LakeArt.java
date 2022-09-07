package com.xworkz.dao.lakedao;

public class LakeArt {

	public static void main(String[] args) {
		LakeDAOImpl daoImpl = new LakeDAOImpl();
		daoImpl.save("BTM lake");
		daoImpl.save("Bellandur lake");
		daoImpl.save("Jakkur lake");
		daoImpl.save("Unkal lake");
		daoImpl.save("Kunigal lake");
		daoImpl.save("Shantisagar lake");
		daoImpl.save("Ulsoor lake");
		daoImpl.save("Agara lake");
		daoImpl.save("Begur lake");
		daoImpl.save("Madiwala lake");
		daoImpl.save("Varthur lake");
		daoImpl.printAllLakes();

		System.out.println("<========================>");
		
		System.out.println("lakes name after deleting");

		daoImpl.delete(4);
		daoImpl.delete(5);
		daoImpl.delete(6);

		daoImpl.printAllLakes();

		System.out.println("<=========================>");
		
		System.out.println("lakes name after updating");

		daoImpl.update(4,"Kengeri lake");
		daoImpl.update(5,"Hebbal lake");
		daoImpl.update(6,"Nagavara lake");

		daoImpl.printAllLakes();
	}

}
