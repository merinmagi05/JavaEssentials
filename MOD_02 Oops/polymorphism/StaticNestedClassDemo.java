package polymorphism;


class OuterClass{
	private static int count=10;
	
	public static class StaticNested{ 	//static nested class
		public void display() {
			System.out.println("inside static nested class--->inside non staic method "+count);
			
		}
		
	}
	
	public void showOuter() {
		System.out.println("Inside Outer class method-non static method count :"+count);
		
	}
	
	
	class InnerClass{
		int num=23;
		public void show() {
			System.out.println("INside Inner Class--->Inside non-static method"+ count++);
			showOuter();
		}
		
	}
}
public class StaticNestedClassDemo {

	public static void main(String[] args) {
		OuterClass.StaticNested sn= new OuterClass.StaticNested();
		sn.display();
		
		OuterClass oc=new OuterClass();
		OuterClass.InnerClass inner=oc.new InnerClass();
		inner.show();
	}

}
