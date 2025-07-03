package thispack;

class StudentDemo {
	int id;
	int age;
	String name;

	StudentDemo() {

	}

	StudentDemo(int id, String name) {
		this.id = id;
		this.name = name;
	}

	StudentDemo(int first, int age) {
		this.id = first;
		this.age = age;
	}
	public void print() {
		System.out.println("StudentDemo [id=" + id + ", age=" + age + ", name=" + name + "]");
	}

	@Override
	public String toString() {
		return "StudentDemo [id=" + id + ", age=" + age + ", name=" + name + "]";
	}

//	public void display() {
//		System.out.println("id:"+id);
//		System.out.println("Name:"+name);
//		System.out.println("Age:"+age);
//		
//	}
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		int id = 23;
		String name = "merin";
		int age = 22;

		StudentDemo demo = new StudentDemo(id, name);
		// demo.display();
		demo.print();
		System.out.println("-------------");
		StudentDemo student = new StudentDemo(id, age);
		student.print();
		// obj.display();

	}

}
