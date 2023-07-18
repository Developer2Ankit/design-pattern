package com;

public class StringObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String first = "hello"; // from pool
		String second = new String("hello"); // new object
		String third = second.intern(); // from pool, same as first

		System.out.println(first == second); // false
		System.out.println(first == third); // true
		System.out.println("----------------ok--------------------"); // true
		String s1=new String("hello");
		String s2=new String("hello");
		System.out.println(s1.intern() == s2.intern()); // false
		
		String s3="hello";
		String s4="hello";
		System.out.println(s3 == s4); // false
	}

}
