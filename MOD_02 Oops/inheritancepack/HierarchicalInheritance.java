package inheritancepack;


class Manager{
	int managerId=23;
	String managerName="Anu";
	public void showDetails() {
		System.out.println("Id ="+managerId);
		System.out.println("Name ="+managerName);
	}
	
}

class Developer extends Manager{
	int devid=63;
	String devName="Ravi";
	public void showDetails() {
		
		System.out.println("Manager Id = "+managerId);
		System.out.println("Manager Name = "+managerName);
		System.out.println("Developer Id = "+devid);
		System.out.println("Developer Name = "+devName);
	}
	
}

class Tester extends Manager{
	int testerid=88;
	String testerName="Varun";
	public void showDetails() {
		
		System.out.println("Manager Id = "+managerId);
		System.out.println("Manager Name = "+managerName);
		System.out.println("Tester Id = "+testerid);
		System.out.println("TesterName = "+testerName);
	}
	
}
class Designer extends Manager{
	int designerId=43;
	String designerName="Riya";
	public void showDetails() {
		
		System.out.println("Manager Id ="+managerId);
		System.out.println("Manager Name= "+managerName);
		System.out.println("Designer Id ="+designerId);
		System.out.println("Designer Name ="+designerName);
	}
	
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		Developer developer=new Developer();
		developer.showDetails();
		System.out.println(".......................");
		Tester tester=new Tester();
		tester.showDetails();
		System.out.println(".......................");
		Designer designer=new Designer();
		designer.showDetails();

	}

}
