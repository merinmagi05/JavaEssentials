package stringpack;

public class StringBufferBuilderCapacity {

	public static void main(String[] args) {
		StringBuffer buff=new StringBuffer("");	//passes string-->default capacity 16
		
		System.out.println("Capacity = "+buff.capacity());
		System.out.println("Length= "+buff.length());
		System.out.println("Reassigned to buff");
		buff=new StringBuffer("Java");
		System.out.println("Capacity = "+buff.capacity());
		System.out.println("Length= "+buff.length());
		
		StringBuffer sb=new StringBuffer(6);	//---->String > 6--->the new capacity is (6*2)+2=14
		System.out.println("Capacity = "+sb.capacity());	//actual capacity*2+2
		System.out.println("Length= "+sb.length());
		sb.append("merit campus luminar");			 	//------->12
		System.out.println("Length= "+sb.length());
		System.out.println("Capacity = "+sb.capacity());
	}

}
