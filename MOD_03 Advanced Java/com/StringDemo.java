package com;

public class StringDemo {

	public static void main(String[] args) {
		String str="merin";		//literal therefore stored in constant pool
		String college="SJCET";
		//String str=new String("merin"); ---->object then it is in heap memory
		str.concat(" Magi"); 	//String is immutable 
		System.out.println(str); //print merin
	}

}
