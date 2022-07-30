package velocity;

public class Access {
	public int a=20;
	int b=5;
	protected int c=30;
	private int d=40;
	
	public void test() {
		System.out.println("public method");
	}
	void test2() {
		System.out.println(" default method");
	}
	protected void test3() {
		System.out.println("protected method");
	}
	private void test4() {
		System.out.println("private method");
	}
	public static void main(String[] args) {
		Access obj =new Access();
		
		System.out.println(obj.a); //public 
		System.out.println(obj.b);// default
		System.out.println(obj.c);//protected
		System.out.println(obj.d);//private
		
		obj.test();
		obj.test2();
		obj.test3();
		obj.test4();
	}
}
