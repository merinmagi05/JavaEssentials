package userexeceptionpack;

public class TestCustomException {
	
	public static void validate(int age) throws InvalidAgeException{ //throws is used to declare, used with method, only one instance
		if(age<18) {	//less than 18 creates an error, then creates an exception object and handsoff to runtime system
			throw new InvalidAgeException("age is no valid");	//InvalidAgeException object is thrown
						//throw is used inside methods, multiple instances
		}else {
			System.out.println("Welcome to vote.");
		}
	}

	public static void main(String[] args) {
				//class InvalidAgeException is handled in try catch block
		try {
			validate(13);
		}catch(InvalidAgeException ex) {	//custom exception that we created
			System.out.println("Exception caught");
			System.out.println("Exception occured : "+ex);
		}

	}

}
