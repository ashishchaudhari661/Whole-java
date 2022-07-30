package WHOLEJAVA;
import HomeWork.B;
public class A9Methods {
	int z=5;
	public void demo() {
		System.out.println("hello everyone");
	}
		void ashish() {
			System.out.println("i am non static method");// non static
		}
	public static void dhiraj() {
		int a=5;
		System.out.println("i am static method");	// static method
	}
	public static void main(String[] args) {
		A9Methods obj = new A9Methods();
		obj.ashish();
		obj.dhiraj();
		System.out.println(obj.z);
		B ob = new B();
		ob.dhiraj();
	}
}
