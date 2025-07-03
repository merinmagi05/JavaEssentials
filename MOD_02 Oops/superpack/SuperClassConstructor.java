package superpack;

class Base{
	Base(){
		System.out.println("Base class....");
	}
}
class Parent extends Base{
	Parent(){
		System.out.println("-----------I am in the super class");
	}
}

class Child extends Parent{
	Child(){
		super();  	//calls immediate super class
		System.out.println("*********I am in the child class constructor");
	}
}

public class SuperClassConstructor {

	public static void main(String[] args) {
		Child child=new Child();
		

	}

}
