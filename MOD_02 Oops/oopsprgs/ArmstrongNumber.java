package oopsprgs;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void armstrongno(int num){
		int digit;
		double sumOfPower=0;
		int number=num;
		int noOfDigits=String.valueOf(num).length();
		
		while(num!=0) {
			digit=num%10;
			sumOfPower+=(int)Math.pow(digit, noOfDigits);
			num=num/10;
		}
		if(sumOfPower==number) {
			System.out.println(number+" is an armstrong number");
		}else {
			System.out.println(number+" is not an armstrong number");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number;
		
		System.out.println("Enter the number:");
		number=sc.nextInt();
		armstrongno(number);

	}

}
