package staticinnerpack;

abstract class Test{
	abstract double getPIValue();
	
}
//class PIvalue extends Test{
//	double getPIValue() {
//		return 3.14;
//	}
//}

public class AbstractClassDemo {
	public static void main(String args[]) {
		//PIvalue pi=new PIvalue();
		
		Test pi=new Test() {   		//anonymous innerclass
			
			@Override
			double getPIValue() {
				return 3.14;
			}
		};
		System.out.println(pi.getPIValue());
		
	}
}
