package polymorphism;

class Base{
//	public static void sum(int num,int first) {
//		System.out.println("inside base method");
//	}
}
class Demo extends Base{
	public static void sum(int first,int second) {
		System.out.println(first+second);
	}
	public int sum(int num,int first,float second) {
		return num+first;
	}
	public static float sum(float num,int second) {
		return second+num;
	}
}
public class MethodOverloading {
	

	public static void main(String[] args) {
		int first=23;
		int second=34;
		float third=26.03f;
		Demo demo=new Demo();
		System.out.println(demo.sum(first,second,third));
		System.out.println(demo.sum(third,second));
		Demo.sum(first,second);
		Demo.sum(third,second);
	}

}
