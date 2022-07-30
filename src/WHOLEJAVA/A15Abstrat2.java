package WHOLEJAVA;

public class A15Abstrat2 extends A15Abstrat {
	public void demo() {						
		System.out.println("hello ashish");		//concrete class
		}
	public void raje() {
		System.out.println("my name is ashish");
	}
	public static void main(String[] args) {
		A15Abstrat2 obj = new A15Abstrat2();
		obj.demo();
		obj.raje();
	}
}
