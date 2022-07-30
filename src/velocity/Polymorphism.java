package velocity;

public class Polymorphism {			// method ovrerloading
public void ashish() {
	System.out.println("zero aruments");
}
public void dhiraj(int a) {
	System.out.println(" int argument");
}
public void shubham(String b) {
	System.out.println(" string argument");
}
public void paresh(int a, int d) {
	System.out.println("int ,int arguments");
	System.out.println(a*d);
}
public static void main(String[]args) {
	 Polymorphism  obj = new  Polymorphism ();
	 obj.ashish();
	 obj.dhiraj(5);
	 obj.shubham("vinod");			
	 obj.paresh(9, 5);
}
}
