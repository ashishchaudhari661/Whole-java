package velocity;

public class Dada {
		public void test() {
			System.out.println("i am parent");
		}
		
		public void demo() {
			System.out.println(" hello everyone");
		}
		public static void main(String [] args) {
			Dada obj = new Son();					// only the parent property are upcasted.
			obj.test();								// which we are overloaded
}}
