package velocity;

public class Cons {
	//constructor overloading
	public Cons(int a,int b)
	{
		System.out.println(a*b);
	}
	public Cons(int a , String b,boolean c) {
		System.out.print(a);
		System.out.println(b);
		System.out.print(c);
	}
	public void sss() {
		int a=5,b=10;
		System.out.println(a*b);
		System.out.println(b-a);
		System.out.println(b/a);
		System.out.println(a+b);
	}
	public Cons(String h) {
		System.out.println(h);
	}
	public static void main(String[] args) {
		Cons obj = new Cons(32,55);
		Cons obj1 = new Cons(97,"dhiraj",true);
		Cons obj2 = new Cons("ashish");
		Cons obj5 = new Cons("aaebjn");
		obj.sss();
	}
}
