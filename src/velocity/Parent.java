package velocity;

public class Parent {
			public void test () {
				System.out.println("i am parent class");
			}
		public static void ashish() {
			System.out.println(" i am static parent class");
		}
		public static void main(String [] args) {
			Parent.ashish();					// we can overload the main method but execution start from default method
		}
		public static void main(int a) {
			//Parent.ashish();
		}
}
