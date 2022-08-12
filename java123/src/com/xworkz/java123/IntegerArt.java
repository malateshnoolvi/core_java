package com.xworkz.java123;

public class IntegerArt {

	public static void main(String[] args) {

		// Integer constructor--

		Integer value = new Integer("45");
		System.out.println(value);

		Integer value2 = new Integer(10);
		System.out.println(value2);
		
		System.out.println("-------------");

		// Integer instance method--

		Integer name = value.hashCode();
		System.out.println(name);

		float name1 = value.floatValue();
		System.out.println(name1);

		int name2 = value.intValue();
		System.out.println(name2);

		long name3 = value.longValue();
		System.out.println(name3);

		double name4 = value.doubleValue();
		System.out.println(name4);

		byte name5 = value.byteValue();
		System.out.println(name5);

		int name6 = value.compareTo(15);
		System.out.println(name6);

		boolean name7 = value.equals(25);
		System.out.println(name7);

		short name8 = value.shortValue();
		System.out.println(name8);

		String name9 = value.toString();
		System.out.println(name9);
		
		System.out.println("--------------");

		// Integer static method--

		Integer a = Integer.min(12,15);
		System.out.println(a);

		Integer b = Integer.sum(10, 15);
		System.out.println(b);

		Integer c = Integer.max(12,24);
		System.out.println(c);
		
		Integer d=Integer.divideUnsigned(24,8);
		System.out.println(d);
		
		Integer e=Integer.sum(12,18);
		System.out.println(e);
		
		Integer f=Integer.highestOneBit(20);
		System.out.println(f);
		
		Integer g=Integer.valueOf(20);
		System.out.println(g);
		
		Integer h=Integer.reverseBytes(24);
		System.out.println(h);
		
		Integer i=Integer.parseUnsignedInt("26");
		System.out.println(i);
		
		Integer j=Integer.reverse(28);
		System.out.println(j);
		
		Integer k=Integer.lowestOneBit(53);
		System.out.println(k);
		

	}

}
