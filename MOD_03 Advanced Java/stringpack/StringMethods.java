package stringpack;

public class StringMethods {

	public static void main(String[] args) {
		int empNo=34;
		String empRoll="E"+empNo;
		//concatenation using + operator
		String str="Merin"+" Magi";
		System.out.println(str);
		System.out.println(empRoll);
		
		String s1="Merin";
		String s2=" Telson";
		//using concat method
		String s3=s1.concat(s2);
		
		String s4="magi";
		String s5=s4.concat(" merin");
		
		System.out.println("s3=>"+s3);
		System.out.println("s5=>"+s5);
		
		//substring
		System.out.println(s1.substring(3));	//begining index
		System.out.println(s1.substring(2, 5)); //begining index,ending index
		System.out.println(s1.subSequence(1, 3));
		
	
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		String s="      merin   ";
		System.out.println(s.toUpperCase());
		System.out.println(s.trim());//delete left and right blank space
		
		System.out.println(s1.startsWith("Me"));
		System.out.println(s1.endsWith("n"));
		
		System.out.println(s1.charAt(3));
		System.out.println(0);
		
		System.out.println(s1.length());
		
		String replaceString=s1.replace("er", "ery");
		System.out.println(replaceString);
		
		//https://dev.mysql.com/downloads/installer/
		

	}

}
