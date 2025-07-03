package assignment;

import java.util.Scanner;

class Librarian{
	int id;
	String name;
	Librarian(int id,String name){
		this.id=id;
		this.name=name;
		
	}
	
	void issuedBooks(String bookName) {
		System.out.println("Details of Issuing Book");
		System.out.println("------------------------");
		System.out.println("Book Name:"+bookName);
		System.out.println("Librarian: "+name);
	}
	
}

public class LibrarianDetails {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int id;
		String name;
		String bookName;
		
		System.out.println("Librarian Details");
		System.out.println("Enter the id:");
		id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the name :");
		name=sc.nextLine();
		
		Librarian obj=new Librarian(id,name);
		
		System.out.println("Enter the book name to issue : ");
		bookName=sc.nextLine();
		
		obj.issuedBooks(bookName);
		sc.close();

	}

}
