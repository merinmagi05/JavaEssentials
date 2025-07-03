package oopsprgs;

import java.util.Scanner;

class Participants{
	int rollNo;
	String name;
	static String collegeName="SJCET";
	Participants(int roll,String studentName){
		rollNo=roll;
		name=studentName;
		
	}
	void displayParticipants() {
		
		System.out.println("Roll no:"+rollNo);
		System.out.println("Name:"+name);
		System.out.println("College Name:"+collegeName);
	}
}


public class YouthFestival {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int roll;
		String studentName;
		
		
		System.out.println("Enter roll no:");
		roll=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter name :");
		studentName=sc.nextLine();
		
		Participants objOne=new Participants(roll,studentName);
		System.out.println("Enter roll no:");
		roll=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter name :");
		studentName=sc.nextLine();
		
		Participants objTwo=new Participants(roll,studentName);
		System.out.println("Youth Participants:");
		
		objOne.displayParticipants();
		objTwo.displayParticipants();
		sc.close();

	}

}
