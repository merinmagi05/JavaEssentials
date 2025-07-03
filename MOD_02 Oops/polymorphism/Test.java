package polymorphism;

class Outer {
	int count; // instance variable

	public void display() {
		Inner inner = new Inner();
		inner.show();
	}

	class Inner { // MemberInnerClass-->static keyword won't use
		public void show() {
			System.out.println("Inside inner class- using count" + count);
		}
	}
}

public class Test {

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.display();

	}

}
