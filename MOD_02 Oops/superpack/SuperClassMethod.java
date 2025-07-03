package superpack;

class Employee{
	public void printDetails() {
		System.out.println("Inside employee");
	}
	public void display() {
		System.out.println("Inside display");
	}
	
}
class Accountant extends Employee{
	@Override
	public void printDetails() {		//override
		System.out.println("inside accountant...");
	}
	public void print() {
		printDetails();		//child 
		super.display();
		super.printDetails();	//super 
		System.out.println("Inside print method ");
	}
	
}

public class SuperClassMethod {

	public static void main(String[] args) {
		Accountant acc=new Accountant();
		//acc.printDetails();
		acc.print();

	}

}
