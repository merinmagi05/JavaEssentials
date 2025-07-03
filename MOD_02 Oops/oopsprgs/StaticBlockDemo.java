package oopsprgs;

class BlockDemo{
	static {//--->works when class loads
		System.out.println("Inside static block");
	}
	{		//----->works when obj creates

		System.out.println("Inside non-static block");
	}
}

public class StaticBlockDemo {

	public static void main(String[] args) {
		BlockDemo objOne=new BlockDemo();
		BlockDemo objTwo=new BlockDemo();

	}

}
