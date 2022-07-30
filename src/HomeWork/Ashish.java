package HomeWork;

public class Ashish {
	int z;
	public int test() {
		int a=4,b=8,c=a+b;
		return c;
	}
	public int test2() {
		int d=5,e=6,f=d+e;
		return f;
	}
	public static void main(String[]args) {
		Ashish obj = new Ashish();
		obj.z=(obj.test()+ obj.test2());
		System.out.println(obj.z);
	}
}
