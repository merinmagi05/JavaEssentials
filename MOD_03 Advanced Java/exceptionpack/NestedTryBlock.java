package exceptionpack;

public class NestedTryBlock {

	public static void main(String[] args) {
		int num;
		int[] arr = new int[5];

		try {
			try { // nested try
				num = 30 / 0;
			} catch (ArithmeticException ae) {
				ae.printStackTrace();
			}

			try {
				arr[5] = 67;
			} catch (ArrayIndexOutOfBoundsException ai) {
				ai.printStackTrace();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		System.out.println("my prgm executed completely");

	}

}
