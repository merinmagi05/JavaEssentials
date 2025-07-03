package assignment;

import java.util.Scanner;

class Receptionist{
	String name;
	
	
	static String shift="morning";
	Receptionist(String name){
		this.name=name;
	}
	void greetings(String visitorName) {
		System.out.print("Good Morning,"+visitorName+"!");
		System.out.println("I am "+name+",the receptionist.");
	}
	void currentShift() {
		System.out.println("Current shift:"+shift);
	}
}

public class ReceptionistDetails {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name;
		String visitorName;
		
		System.out.println("Enter the name of the Receptionist");
		name=sc.nextLine();
		System.out.println("Enter the name of the visitor:");
		visitorName=sc.nextLine();
		
		Receptionist obj=new Receptionist(name);
		obj.greetings(visitorName);
		obj.currentShift();
		sc.close();
		
		

	}

}
