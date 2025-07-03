package staticinnerpack;

class OuterTest {
	int count = 1;
	static int num = 2;

	public void display() {
		for (int i = 1; i < 5; i++) {
			class LocalTest { // Local inner class
				public void show() {
					System.out.println("num=" + num);
				}

			}
			System.out.println(i);

			LocalTest test = new LocalTest();
			test.show();
		}

	}
}

public class LocalTest {

	public static void main(String[] args) {
		OuterTest ot = new OuterTest();
		ot.display();

	}

}
