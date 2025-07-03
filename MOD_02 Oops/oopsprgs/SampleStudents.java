package oopsprgs;

import java.util.Scanner;

class StudentData{						//memory space is created in heap memory
	int rollNo;			//instance variable			//null
	String studentname;				//0
	//method creation ,...>method is used to perform a particular task
	public void saveDetails(int roll,String name) {
		rollNo=roll;	
		studentname=name;
		//static String collegeName;  //static variable there is no memory  allocataion
		
	}
	
	public void printDetails() {
		System.out.println("Rollno: "+rollNo);
		System.out.println("Name: "+studentname);
		
	}
}

public class SampleStudents {

	public static void main(String[] args) { //Stack memory
		Scanner sc=new Scanner(System.in);	//should me in main method
		int roll;					//instance variable
		String name;				//instance variable
		
		StudentData obj1=new StudentData();	//------------>goes to the heap memory and create by default constructor if not created
		StudentData obj2=new StudentData();
		System.out.println("Enter the roll no:");
		roll=sc.nextInt();	
		sc.nextLine();
		System.out.println("Enter the name:");
		name=sc.nextLine();		// scanner is called by sc --->non static methods classes obj is called 
		
		obj1.saveDetails(roll,name);
		obj1.printDetails();
		
		
		
		sc.close();

	}

}
