package abstractpack;


abstract class AbstractDemo{
	int num=15;						//non static variables can be declared in abstract class
	static String str="Abstract Class";
	
	public abstract void display();//abstract method
	
	public void print(String str) {//non-static method
		System.out.println(str);
	}
	static void show() {		//static method
		System.out.println("inside show method(static method)");
	}
}


class Test extends AbstractDemo{	//child class can be abstact to use different method

	@Override
	public void display() {		//concrete method
		System.out.println(str);
		System.out.println(num);
	}
	
}


public class AbstractClassMembers {

	public static void main(String[] args) {
		
		//Test test=new Test();
		AbstractDemo test=new Test();
		test.display();
		
		test.print("Merin");
		//test.show(); ==> don't call a static method using object
		//Test.show();
		
		AbstractDemo.show();
		
	}

}
