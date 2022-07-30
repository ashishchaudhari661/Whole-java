package velocity;

public class Son extends Dada{
		public void test() {
			System.out.println("overided");
		}
		public void wed() {
			System.out.println(" i am child");
		}
		public static void main(String [] args) {
			Dada obj = new Son();
			obj.test();
		}
}
