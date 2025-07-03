package exceptionpack;

import java.io.IOException;

public class HandleCheckedException {

	public static void main(String[] args) {
		try {
			throw new IOException("File not found..");
		}catch(IOException e) {
			System.out.println("Caught exception: "+e.getMessage());
		}

	}

}
