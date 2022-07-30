package velocity;

public class Sub1 extends Sub {
public void ashish() {
	System.out.println("i am the child ");
}
public void dhiraj() {
	System.out.println("i am the chind 1");
}
public static void main(String[] args) {
	Sub1 obj = new Sub1();
	obj.vinod();
	obj.damodar(); // Tip : we can not access the private methods by inheritance 
	obj.damodar1();
	obj.ashish();
	System.out.println(obj.b);
}
}
