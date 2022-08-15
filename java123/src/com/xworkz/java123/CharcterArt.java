package com.xworkz.java123;

public class CharcterArt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// charcter type constructor--

		Character name = new Character('A');
		System.out.println(name);
		
		System.out.println("--------------");
		
		// character type instance method--
		
		char a = name.charValue();
		System.out.println(a);

		int b = name.compareTo('B');
		System.out.println(b);

		boolean c = name.equals('c');
		System.out.println(c);

		int d = name.hashCode();
		System.out.println(d);

		String e = name.toString();
		System.out.println(e);

		System.out.println("--------------");

		// character type static method--

		int f = Character.charCount(2);
		System.out.println(f);

		char g = Character.toTitleCase('B');
		System.out.println(g);

		byte h = Character.getDirectionality('N');
		System.out.println(h);

		int i = Character.compare('A','B');
		System.out.println(i);

		boolean j = Character.isDefined('K');
		System.out.println(j);

		int k = Character.getNumericValue('L');
		System.out.println(k);

		int l = Character.toCodePoint('c', 'D');
		System.out.println(l);

		char m = Character.toLowerCase('G');
		System.out.println(m);

		char n = Character.toUpperCase('q');
		System.out.println(n);

		char p = Character.reverseBytes('U');
		System.out.println(p);

		boolean q = Character.isTitleCase('M');
		System.out.println(q);

	}

}
