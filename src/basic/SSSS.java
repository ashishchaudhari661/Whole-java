package basic;

public class SSSS {
	int z;
	int x;
	public int test() {
		int a=5;
		int b=5;
		 z=a+b;
		 System.out.println(z);
		return z;
	}
	public int demo() {
		int f=9;
		int h=6;	
	 x=f+h;
	 System.out.println(x);
		return x;
	}
	public void sweta() {
		int M= z+x;
		System.out.println(M);
	}
	public static void main(String[] args) {
		SSSS  obj = new SSSS();
	//	obj.test();
	//	obj.demo();
		obj.sweta();	
	}
}
