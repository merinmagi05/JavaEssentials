package userexeceptionpack;

public class InvalidAgeException extends Exception{
	public InvalidAgeException(String str) {	//constructor of superclass
		super(str);//access superclass members
	}
}
