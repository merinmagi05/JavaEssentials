package com;

public class Demo {

	public static void main(String[] args) throws ArithmeticException {
		int data = 50;
		int result;

		try {
			result = data / 0;
			System.out.println(result);
		} catch (ArithmeticException ex) {//exception within the parameter 
			// System.out.println("Error occured ");
			// System.out.println(ex.getMessage());
			// System.err.println("error");
			ex.printStackTrace();	//best practice
		}

		System.out.println("Rest of the code");
	}

}
