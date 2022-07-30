package velocity;

public class ABS2  extends ABS	{			//concrete class-the class where
//	we complete this incomplete methods of abstract class is known as concrete class.
	
			public void demo() {
				System.out.println( "method is completed");
			}
			public static void main(String [] args) {
				ABS2 obj = new ABS2();
				obj.test();
				obj.demo();
			}
}
