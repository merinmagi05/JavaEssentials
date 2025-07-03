package polymorphism;


class Employee{
	public void duty(String str) {
		System.out.println("Employee is responsible to do "+str);
	}
	
}

class Accountant extends Employee{
	double salary;
	
	Accountant(double salary){
		this.salary=salary;
	}
	public void duty(String str) {
		System.out.println("Employee is responsibke to do "+str);
		System.out.println("Employee salary is  "+salary);
	}
}


class Manager extends Employee{
	double salary;
	double increment;
	Manager(double salary,double increment){
		this.salary=salary;
		this.increment=increment;
	}
	public void duty(String str) {
		System.out.println("Employee is responsibke to do "+str);
		System.out.println("Employee salary is  "+salary);
		System.out.println("Employee increment is "+increment);
		System.out.println("Total Salary is :"+(salary+increment));
	}
}
public class MethodOverridingDemo {

	public static void main(String[] args) {
		Employee emp1=new Accountant(2300); 	//late binding
		emp1.duty("development");
		System.out.println("-------------");
		Employee emp2=new Manager(23000,1000);
		emp2.duty("Designing");
	}

}
