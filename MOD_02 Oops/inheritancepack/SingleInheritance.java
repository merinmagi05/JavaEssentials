package inheritancepack;

class Doctor{					//SuperClass || parent class ||base class
	String skills="MBBS";
	public void showSkills() {
		System.out.println(skills);
	}
}
class Ortho extends Doctor{		//Subclass || derived class ||child class
									// inherits the properties of doctor
	String qualification="MS";
	public void showDetails() {
		System.out.println(qualification);
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		Ortho ortho=new Ortho();
		System.out.println(ortho.skills);
		System.out.println(ortho.qualification);
		

	}

}
