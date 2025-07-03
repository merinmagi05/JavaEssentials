package encapsulation;

import java.util.Scanner;

class Student{
	private int id;
	private String name;
	
	//data setter methods
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
}
public class JavaBeanClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int id;
		String name;
		
		System.out.println("Enter id:");
		id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name:");
		name=sc.nextLine();
		
		Student student=new Student();
		student.setId(id);
		student.setName(name);
	
		
		System.out.println("Id: "+student.getId()+"\nName: "+student.getName());
		
	}

}
