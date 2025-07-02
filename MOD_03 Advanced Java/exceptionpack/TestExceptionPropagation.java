package exceptionpack;

public class TestExceptionPropagation {
	void print() {// ------------------------------------------------------4
		int data;
		data = 50 / 0; // exception occured
	}

	void display() {
		print();// -------------------------------------------------------------3
	}

	void test() {
		try {
			display();// --------------------------------------------------------2
		} catch (Exception e) {
			System.out.println("Exception Handled");

		}
	}

	public static void main(String[] args) { // VM.---->exception happens in main thread ...
		TestExceptionPropagation obj = new TestExceptionPropagation();
		obj.test();// ------------------------------------------------------------1
		System.out.println("Normal Flow");

	}

}
