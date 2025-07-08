package stringpack;

import java.util.StringTokenizer;

public class StringToken {

	public static void main(String[] args) {
		StringTokenizer st=new StringTokenizer("Luminar Technolab Kakkanad Kochi"," ");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		StringTokenizer sto=new StringTokenizer("Luminar:Technolab:Kakkanad:Kochi");
		System.out.println("Next token is:"+sto.nextToken(" :"));
	}

}
