package HomeWork;

public class Febonacci {
public static void main(String[]args) {
	int a=1;
	int b=1;
	int c;
	System.out.println(a);
	System.out.println(b);
	for(int i=2;i<10;i++) {
		System.out.println(c=a+b);
		a=b;
		b=c;
	}
}
}
