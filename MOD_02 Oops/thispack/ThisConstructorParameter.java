//"this" can be used as a parameter in constructor

package thispack;

class Demo{
	Demo(Tests ob){
		System.out.println("Inside class Demo");
		
	}
	
}


class Tests{
	Tests(){
		Demo obj1=new Demo(this);
		System.out.println("hi..inside Tests");
		
	}
	
}

public class ThisConstructorParameter {

	public static void main(String[] args) {
		Tests obj=new Tests();

	}

}
