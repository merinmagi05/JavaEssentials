package oopsprgs;


class Admin{
	int enroll;
	String name;
	
	Admin(int userenroll,String username){
		enroll=userenroll;
		name=username;
	}
	
	Admin(Admin obj) { //copy constructor--->new object that is the copy of existing object.
		enroll=obj.enroll;
		name=obj.name;
	}

	void printDetails() {
		System.out.println("=====Inside method=====");
		System.out.println("Enroll="+enroll+"\tName="+name);
		
	}
}
public class CopyConstructorTest {

	public static void main(String[] args) {
		Admin first=new Admin(23,"merin");
		System.out.println("Enroll="+first.enroll+"\tName="+first.name);
		Admin second=new Admin(first);//---->obj 
		second.printDetails();
		

	}

}
