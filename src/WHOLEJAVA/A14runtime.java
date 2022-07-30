package WHOLEJAVA;

public class A14runtime extends A9Methods {
	
		public void demo() {
			System.out.println("hello ");
		}
		public void ashish() {
			System.out.println("i am also non static ");
		}
		public void test() {
			super.ashish();		//for calling parent class
			this.ashish();		//for calling current class
		}
		
		public static void main(String[] args) {
			A14runtime obj = new A14runtime();
			A9Methods ob =new A9Methods();
			obj.demo();
			ob.demo();
			obj.test();
		}
}
