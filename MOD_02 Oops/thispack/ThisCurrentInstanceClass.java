package thispack;

class CurrentTest{
	public void show() {
		System.out.println("Inside Show method");
	}
	
	CurrentTest getDisplay() {//----since the datatype of the obj is the class
		System.out.println("Inside getDisplay Method");
		return this;		//this will be the return as it is the name of the class
	
	}
	
	
}
public class ThisCurrentInstanceClass {
	public static void main(String args[]){
		CurrentTest current=new CurrentTest();
		current.getDisplay().show();
	}
	

}
