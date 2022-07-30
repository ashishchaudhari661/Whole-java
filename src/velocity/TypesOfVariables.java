package velocity;

public class TypesOfVariables {
	int a=20; // Non static global variable or instance variable 
	static int b=5; // static global variable or class variable
	public void test() {
		System.out.println("ashish");
		System.out.println(a); // non static global variable can be directly called in non static method
		System.out.println(b); // static variable can be directly called in all method of class
	}
	public static void demo () {
		System.out.println(a); // non static global variable can not be called directly in static method
		System.out.println(b);
	}
	public static void main(String[] args) {
		TypesOfVariables obj = new TypesOfVariables();
		System.out.println(obj.a); // non static variables can not be called directly in static method
		System.out.println(b);
		
	}
}
