package thispack;

class MethodChaining{
	
	public void display() {
		System.out.println("Inside display method");
		show();		 //invoke current class method implicitly
					//this.show(); can be called by like this 
	}
	public void show() {
		System.out.println("Inside show");
	}
}
public class ThisMethodDemo {

	public static void main(String[] args) {
		MethodChaining obj1=new MethodChaining();
		obj1.display();
		

	}

}
