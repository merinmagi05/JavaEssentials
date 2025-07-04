package stringpack;

public class StringComparison {

	public static void main(String[] args) {
		String s1="Merin";
		String s2="Merin";
		String s3=new String("Merin");
		String s4="MeRin";
		String s5=new String("Oracle");
		
		//equals() 	-> content/actual value
		System.out.println("------equals()-------");
		System.out.println("s1.equals(s2)"+s1.equals(s2));
		System.out.println("s1.equals(s3)"+s1.equals(s3));
		System.out.println("s1.equals(s4)"+s1.equals(s4)); //false
		
		System.out.println(s1.equalsIgnoreCase(s4));//true
		
		//==operator	->	memory reference(address)
		System.out.println("____== Operator____");
		System.out.println("s1==s2"+s1==s2);
		System.out.println("s1==s3"+s1==s3);
		
		//compareTo()	->compare+sort
		System.out.println("-------CompareTo------");
		System.out.println("s1.compareTo(s2)=>"+s1.compareTo(s2));
		System.out.println("s3.compareTo(s5)=>"+s3.compareTo(s5));
		System.out.println("s5.compareTo(s3)=>"+s5.compareTo(s3));
	}

}
