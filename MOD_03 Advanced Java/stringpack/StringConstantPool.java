package stringpack;

public class StringConstantPool {

	public static void main(String[] args) {
		String s1="java";	//constant pool
		String s2="java";	//constant pool
		String s3=new String("java");	//heap memory
		
		if(s1==s2) { 	//same memory address
			System.out.println("(s1==s2)"+(s1==s2));		//constant pool-->literal(same memory reference)
		}else {
			System.out.println("(s1==s2)"+(s1==s2));
		}
		
		if(s1==s3)		//crosschecks memory address
			System.out.println("(s1==s3)"+(s1==s3)); //s1-->constant pool, s3-->heap -->Separate memory address
		else
			System.out.println("(s1==s3)"+(s1==s3));
		
		s1.concat("Luminar");
		System.out.println("after concatnation(reassigned) "+s1);
		
		s1=s1.concat(" luminar");
		if(s1==s2) { 	//same memory address
			System.out.println("(s1==s2)"+(s1==s2));		//constant pool-->literal(same memory reference)
		}else {
			System.out.println("(s1==s2)"+(s1==s2));
		}
		System.out.println("s1 "+s1);
		System.out.println("s2 "+s2);

	}

}
