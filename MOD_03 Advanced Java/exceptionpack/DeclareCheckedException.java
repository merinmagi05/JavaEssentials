package exceptionpack;

import java.io.IOException;

public class DeclareCheckedException {
	static void readFile() throws IOException {
		throw new IOException("File can't be read");
	}
	public static void main(String[] args) {
		try {
			readFile();
		}catch(IOException e) {
			System.out.println("Handled in main "+e.getMessage());
		}

	}

}
