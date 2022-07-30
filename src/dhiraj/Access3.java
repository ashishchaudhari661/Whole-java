package dhiraj;
import velocity.Access;
public class Access3   {
	public static void main(String[] args) {
		Access obj = new Access();
		
		System.out.println(obj.a);
		System.out.println(obj.b);// default element can not access outside the package 
		System.out.println(obj.c);// protected element can not called directly outside the package
		System.out.println(obj.d);// private element can not access outside the package
		
// methods
		
		obj.test();
		obj.test2(); //default method can not access outside the package
		obj.test3(); // protected method can not called directly outside the package but we can called by the inheritance
		obj.test4(); // private method can not access outside the package
	}

}
