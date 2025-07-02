package exceptionpack;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		int arr[] = new int[5];

		try {
			arr[5] = 30 / 0;

		} catch (ArithmeticException ae) { //type of exception within the parameter
			System.out.println("Arithmetic Exception");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException occurs");
		} catch (Exception e) {	//Base class must be last
			System.out.println("Parent exception occurs");
		}
		System.out.println("Rest of the code ");

	}

}
