package staticinnerpack;

interface PIValueDetector {
	public double getPIValue();

}

/*
class TestDemo implements InterfaceDetector {
	public double getPIValue(){
		return 3.14;
	}
}
*/

public class InterfaceDemo {

	public static void main(String[] args) {
//		TestDemo demo = new TestDemo();
//		System.out.println("Pivalue:"+demo.getPIValue());
		
		PIValueDetector pi=new PIValueDetector() {   
			public double getPIValue(){
				return 3.14;
			}
		};
		

	}

}
