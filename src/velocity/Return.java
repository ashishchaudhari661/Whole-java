package velocity;

public class Return {
	
	String a="ashish";
		public int add() {
		int a=2;
		int b=5;
		int c= a+b;
		return c;
	}
	public static void main(String [] args) {
		Return obj = new Return();
		int i = obj.add();				// by using return type we can use our 
		System.out.println(i);			// output as input to the another 
		System.out.println(i+8);
		String s=obj.a.toUpperCase();
		System.out.println(s);
}
}