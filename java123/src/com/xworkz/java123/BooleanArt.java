package com.xworkz.java123;

public class BooleanArt {

	public static void main(String[] args) {
		// boolean type constructor--

		Boolean name1 = new Boolean(true);
		System.out.println(name1);

		Boolean name2 = new Boolean("home");
		System.out.println(name2);

		// boolean type instance method--

		boolean a = name1.booleanValue();
		System.out.println(a);

		boolean b = name1.equals("satae");
		System.out.println(b);

		int c = name1.compareTo(true);
		System.out.println(c);

		int d = name1.hashCode();
		System.out.println(d);

		String e = name1.toString();
		System.out.println(e);

		// boolean static mathod---

		boolean f = Boolean.getBoolean("bat");
		System.out.println(f);

		int g = Boolean.compare(b, false);
		System.out.println(g);

		boolean h = Boolean.getBoolean("State");
		System.out.println(h);

		int i = Boolean.hashCode(true);
		System.out.println(i);

		boolean j = Boolean.logicalAnd(true, true);
		System.out.println(j);

		boolean k = Boolean.logicalOr(true, false);
		System.out.println(k);

		boolean l = Boolean.logicalXor(false, false);
		System.out.println(l);

		boolean m = Boolean.parseBoolean("home");
		System.out.println(m);

		boolean n = Boolean.valueOf(h);
		System.out.println(n);

		String p = Boolean.toString(true);
		System.out.println(p);
		

	}

}
