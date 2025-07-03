package oopsprgs;

class Student{
	int rollNo;  //don't initialize values here 
	String name;
	
	//constructor creation
	Student(){			//-------->default constructor,initial values are set here in the instance variable
		
		rollNo=0;		//instance variable set default value 
		name=null;		//instance variable set default value
	}
	Student(int roll){	//-------->argument constructor,initial values are set here in the instance variable
		
		rollNo=0;
		name=null;
	}
	
}

public class StudentDetails {
	//all inputs are taken in main class
	public static void main(String[] args) {
	
		String name=new String("bini");
		Student obj=new Student();
		System.out.println(obj);
		System.out.println(obj.name+" "+obj.rollNo);
		Student obj1=new Student();
		
		//System.out.println(rollNo);
		
		
		
		
	}

}
