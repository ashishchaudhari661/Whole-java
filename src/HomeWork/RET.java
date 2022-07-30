package HomeWork;

public class RET {
	
	String d="ashish";
	public String demo() {
	String h="hello";
	return h;
	}
	public int test() {
		
		int a=9;
		int b=5;
		int c=a*b;
		return c;
	}
	
	public static void main(String[] args) {
		RET obj = new RET();
		String n=obj.demo();
		System.out.println(n + " EVERYONE");
		int j=obj.test();
		System.out.println(j);
		System.out.println(j+9);
	String z=	obj.d.toUpperCase();
	System.out.println(z + " CHAUDHARI IS MY FULL NAME");
	}
}
