package exceptionpack;

public class MultiCatchExample {

	public static void main(String[] args) {

		String str=null;	
		int num;
		
		try {
			num=10/0;
			System.out.println(str.length());
			System.out.println(num);
		}catch(NullPointerException |ArithmeticException e) {
			System.out.println("Handeld:"+e);
		}
		System.out.println("Program executed....");

	}

}
