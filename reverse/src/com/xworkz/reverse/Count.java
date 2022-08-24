package com.xworkz.reverse;

public class Count {
	public static void main(String[] args) {
		String name = "india is my country";
		char value = 'i';
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == value)
				count++;
		}
		System.out.println(value +"total is" + count);
	}
}