package callbypack;


class Student{
	
}

class Library{
	
}

class College{
	void details(Student s,Library l) {
		
	}
}


public class CallByReference {

	public static void main(String[] args) {
		College clg=new College();
		Library library=new Library();
		Student std=new Student();
		
		clg.details(new Student(),new Library());// constructor is called 
	}

}
