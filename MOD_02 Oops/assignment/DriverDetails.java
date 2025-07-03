package assignment;

import java.util.Scanner;

class BusDriver{
	String name;
	int busNo;
	static int count=0;
	
	BusDriver(String name,int busNo){
		this.name=name;
		this.busNo=busNo;
		count++;
	}
	
	void display() {
		System.out.println("DRIVER DETAILS");
		System.out.println("Name:"+name);
		System.out.println("Bus no.:"+busNo);
	}
	
}

public class DriverDetails {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name;
		int busNo;
		
		System.out.println("Enter the name of the Driver:");
		name=sc.nextLine();
		System.out.println("Enter the bus number:");
		busNo=sc.nextInt();
		sc.nextLine();
		BusDriver driver1=new BusDriver(name,busNo);
		
		System.out.println("Enter the name of the Driver:");
		name=sc.nextLine();
		System.out.println("Enter the bus number:");
		busNo=sc.nextInt();
		sc.nextLine();
		
		BusDriver driver2=new BusDriver(name,busNo);
		
		driver1.display();
		driver2.display();
		System.out.println("Total Drivers:"+BusDriver.count);

	}

}
