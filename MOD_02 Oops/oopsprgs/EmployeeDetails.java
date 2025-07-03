package oopsprgs;

import java.util.Scanner;

class EmployeeOne{
	int empId;
	String empName;
	int empSalary;
	
	EmployeeOne(int id,String name,int salary){		//parameterized constructor-->where value is passed 
		empId=id;									// full argumented constructor then undefined ...error occures
		empName=name;
		empSalary=salary;
	}
	
	public void printData() {
		System.out.println("ID:"+empId);
		System.out.println("Name:"+empName);
		System.out.println("Salary:"+empSalary);
	}
}

public class EmployeeDetails {

	public static void main(String[] args) {		//stack memory
		Scanner sc=new Scanner(System.in);
		int id;
		String name;
		int salary;
		
		
		
		System.out.println("Enter id: ");
		id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name: ");
		name=sc.nextLine();
		System.out.println("Enter Salary: ");
		salary=sc.nextInt();
		
		EmployeeOne empOne=new EmployeeOne(id,name,salary);	//constructor //-------->memory space created in heap
		empOne.printData();
		
		System.out.println("Enter id: ");
		id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name: ");
		name=sc.nextLine();
		System.out.println("Enter Salary: ");
		salary=sc.nextInt();
		EmployeeOne empTwo=new EmployeeOne(id,name,salary);//-------->memory space created in heap
		empTwo.printData();
		
		sc.close();
		
		
		
	}

}
