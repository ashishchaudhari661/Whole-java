package velocity;

public class Constructors {
	public Constructors() {
		System.out.println("I am constructor");
	}
	public void test() {
		System.out.println("hello");
	}
	public void demo() {
		System.out.println("good morning");
	}
	public static void main(String[] args) {
		Constructors obj = new Constructors();
		obj.test();
		obj.test();
		obj.demo();
	}
}
//constructor allocate memory for object
//Constructors loads the class member into object
//Constructors have same name as class name 
//Constructors has no return type ( means "VOID")
//only those code should be return in Constructors which is need to be called once at object creation