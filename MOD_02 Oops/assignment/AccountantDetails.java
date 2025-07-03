package assignment;

import java.util.Scanner;

class Accountant{
	String name;
	String type;
	int basicSalary;
	Accountant(String name,String type,int basicSalary){
		this.name=name;
		this.type=type;
		this.basicSalary=basicSalary;
		
	}
	
	void show() {
		double hra=basicSalary*0.20;
		double da=basicSalary*0.10;
		double salary=0;
		
		if(type.equals("full-time")) {
			salary=hra+da+basicSalary;
		}else if(type.equals("part-time")) {
			salary=da+basicSalary;
		}else {
			System.out.println("The type should be part-time or full-time");
			return;
		}
		System.out.println("Accountant Details");
		System.out.println("Name:"+name);
		System.out.println("Type:"+type);
		System.out.println("Basic Salary:"+basicSalary);
		System.out.println("Total Salary:"+salary);
		System.out.println("-----------------------------");
	}
}

public class AccountantDetails {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name;
		String type;
		int basicSalary;
		
		System.out.println("Enter the name:");
		name=sc.nextLine();
//		System.out.println("Enter the type (part-time or full-time):");
//		type=sc.nextLine();
		System.out.println("Basic Salary:");
		basicSalary=sc.nextInt();
		sc.nextLine();
		Accountant parttime=new Accountant(name,type="part-time",basicSalary);
		
		System.out.println("Enter the name:");
		name=sc.nextLine();
//		System.out.println("Enter the type (part-time or full-time):");
//		type=sc.nextLine();
		System.out.println("Basic Salary:");
		basicSalary=sc.nextInt();
		sc.nextLine();
		
		Accountant fulltime=new Accountant(name,type="full-time",basicSalary);
		System.out.println("\nPART-TIME ACCOUNTANT:");
		parttime.show();
		System.out.println("FULL-TIME ACCOUNTANTS:");
		fulltime.show();
		
		sc.close();
		

	}

}
