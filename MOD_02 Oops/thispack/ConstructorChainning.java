package thispack;

class ConstructorDemo{
	int first;
	int second;
	ConstructorDemo(){
		//System.out.println("hi"); -->error occures as this must be the first statement
		this(10,20);  //this is an extra parameter-->current instance of the class(current obj)
	}
	ConstructorDemo(int first){
		this(first,24);		//constructor chaining
		
	}
	ConstructorDemo(int first,int second){
		this.first=first;//this here represents obj1
		this.second =second;
	}
	public void display() {
		System.out.println(first+"\t"+second);
	}
}


public class ConstructorChainning {

	public static void main(String[] args) {
		ConstructorDemo obj1=new ConstructorDemo();
		ConstructorDemo obj2=new ConstructorDemo(22);
		obj1.display();
		obj2.display();
		ConstructorDemo obj3=new ConstructorDemo(23,45);
		
		obj3.display();
		
	}

}
