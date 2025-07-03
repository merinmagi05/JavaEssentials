package superpack;

class Demo{
	int id=23;
	String name="merin";
}

class SampleDemo extends Demo{
	int id=34;
	String name="magi";
	SampleDemo(){
		System.out.println(super.id);
		System.out.println(name);
		System.out.println(super.name);
	}
	
//	public void print() {
//		System.out.println(super.name);		//super 
//		System.out.println(name);
//	}
}
public class InstanceVariable {

	public static void main(String[] args) {
		SampleDemo sampleDemo=new SampleDemo();
		//demo.print();

	}

}
