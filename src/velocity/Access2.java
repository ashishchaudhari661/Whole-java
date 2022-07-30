package velocity;

public class Access2 {
	public static void main(String[] args) {
		Access obj =new Access();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);// private element can not access outside the class
		
		obj.test();
		obj.test2();
		obj.test3();
		obj.test4();// private method can not access outside the class
	}
}
