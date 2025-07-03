package inheritancepack;
class Student{
	String name="merin";
	
}

class CollegeStudent extends Student{
	String course="btech";
}

class BtechStudents extends CollegeStudent{
	
	String semester="Third";
	public void showDetails() {
		System.out.println(name);
		System.out.println(course);
		System.out.println(semester);
	}
	
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		BtechStudents btechstudents=new BtechStudents();
		btechstudents.showDetails();
	}

}
