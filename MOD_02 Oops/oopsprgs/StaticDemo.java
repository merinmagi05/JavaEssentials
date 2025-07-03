package oopsprgs;

class Test{
	int num;
	Test(){
		num=10;
	}
	static {
		System.out.println(num);
		display();  			//Non-static members can't be accessed in static methods and static initialize blocks
	}
	public static void print() {
		System.out.println(num);
		display();				//Non-static methods can’t be invoked in static methods and static initialize blocks.
	}
	public static void display() {
		System.out.println("hi");
	}
	
	
}
public class StaticDemo {

	public static void main(String[] args) {
		
		
	}

}
