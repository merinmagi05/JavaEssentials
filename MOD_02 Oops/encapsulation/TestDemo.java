package encapsulation;

class Employee{
	int empid;
	String empName;
	float empSalary;
	public void setId(int empid) {
		this.empid=empid;
	}
	public int getId() {
		return empid;
	}
	
	public void setName(String empName) {
		this.empName=empName;
	}
	public String getName() {
		return empName;
	}
	
	public void setSalary(float empSalary) {
		this.empSalary=empSalary;
	}
	public float getSalary() {
		return empSalary;
	}
	
	public String toString() {
		return empid+" "+empName+" "+empSalary;
	}
}

public class TestDemo {

	public static void main(String[] args) {
		int empid=23;
		String empName="Merin";
		float empSalary=23.0f;
		
		Employee employee=new Employee();
		employee.setId(empid);
		employee.setName(empName);
		employee.setSalary(empSalary);
		
		System.out.println(" id: "+employee.getId()+" \tname: "+employee.getName()+"\tSalary : "+employee.getSalary());
		
		System.out.println(employee);
	}

}
