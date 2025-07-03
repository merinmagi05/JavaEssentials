//write  a java prgm to count the objects
package oopsprgs;


class ObjectCounter{
	static int count=0;		//--->static variable is owned by class  so whenever obj is created count increments
	ObjectCounter(){
		count++;
	}
//	public void printObjects() {
//		System.out.println(count);
//	}
}


public class StaticVariableDemo {

	public static void main(String[] args) {
		
		ObjectCounter obj1=new ObjectCounter();
		
		ObjectCounter obj2=new ObjectCounter();
		ObjectCounter obj3=new ObjectCounter();
		ObjectCounter obj4=new ObjectCounter();
		
		
		//obj1.printObjects();
		System.out.println(ObjectCounter.count);

	}

}
