package WHOLEJAVA;

public class A14polymorphism {
	void test() {
		System.out.println("hello");	//compile time polymorphism
	}
	void test(int a) {
		System.out.println(a);		//method overloading
	}
	public void test(int c,int b) {
		System.out.println(c*b);
	}
	public static void main(String[]args ) {
		 A14polymorphism obj = new  A14polymorphism();
		 obj.test();
		 obj.test(5);
		 obj.test(4,6);
	}
}
