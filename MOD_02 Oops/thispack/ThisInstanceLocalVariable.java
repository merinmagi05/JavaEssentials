package thispack;

import java.util.Scanner;

class Student{
	int rollNo;	//instance variable
	Student(int rollNo){
		//rollNo=rollNo; 	//local variable=local variable ...
		this.rollNo=rollNo;				//this keyword is used to differentiate instance variable 
	}
}

public class ThisInstanceLocalVariable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rollNo;
		
		System.out.println("Enter the Roll no:");
		rollNo=sc.nextInt();
		
		Student obj1=new Student(rollNo);//--->calling parameterized constructor
		System.out.println(obj1.rollNo);
		sc.close();

	}

}
