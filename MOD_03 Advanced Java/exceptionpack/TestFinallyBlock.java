package exceptionpack;

public class TestFinallyBlock {
	public static void main(String[] args) {
		int data;
		try {
			data=25/0;
			System.out.println(data);
		}catch(Exception e){
			e.printStackTrace();
		}
		finally {
			System.out.println("Finally block executed....");
		}
		System.out.println("rest of the code ");
	}
}
