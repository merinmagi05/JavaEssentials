package thispack;

class ParameterMethod {
	public void display() {
		System.out.println("Inside display Method");
		show(this);
	}

	public void show(ParameterMethod ob) {
		System.out.println("inside show method");
	}
}

public class ThisMethodParameter {

	public static void main(String[] args) {
		ParameterMethod obj = new ParameterMethod();
		obj.display();

	}

}
