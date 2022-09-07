package com.xworkz.dao.lakedao;

public class LakeDAOImpl implements LakeDAO {
	private String[] lakeNames = new String[10];

	@Override
	public boolean save(String lakeName) {
		for (int i = 0; i < lakeNames.length; i++) {
			if (lakeNames[i] == null) {
				lakeNames[i] = lakeName;
				return true;

			}

		}

		return false;
	}

	@Override
	public void printAllLakes() {
		for (int i = 0; i < lakeNames.length; i++) {
			System.out.println(lakeNames[i]);
		}

	}

	@Override
	public void delete(int index) {
		lakeNames[index] = null;
	
	}

	@Override
	public void update(int index, String name) {
		lakeNames[index] = name;
	}

}
