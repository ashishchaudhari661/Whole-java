package velocity;

public abstract class ABS {
			public void test() {
			System.out.println("hello");
			}
			public abstract void demo(); // abstract method (incomplete method)
			public static void main(String [] args) {
				ABS obj = new ABS();		// We can not create the object of abstract class
			}
}
	//Or we can say that an Abstract class have at least one complete and 
	//	one incomplete method in it.

	//Abstract class does not have constructor in it, not even default constructor.