package HomeWork;

public class BshapeReverse { 
public void A() {
	for(int i=1;i<=4;i++) {
		for (int j=1;j<=4-i;j++) 
		{System.out.print("  ");
		}for(int j=1;j<=i;j++) {
			System.out.print(" *");
		}System.out.println();
	}
}public void B() {
	int n=4;
	for(int i=3;i>=1;i--) {
		for(int j=1;j<=n-i;j++) {
			System.out.print("  ");
		}for(int j=1;j<=i;j++) {
			System.out.print(" *");
		}System.out.println();
	}
}public void C() {
	for(int i=2;i<=4;i++) {
		for (int j=1;j<=4-i;j++) 
		{System.out.print("  ");
		}for(int j=1;j<=i;j++) {
			System.out.print(" *");
		}System.out.println();
	}			
}public void D() {
	int n=4;
	for(int i=3;i>=1;i--) {
		for(int j=1;j<=n-i;j++) {
			System.out.print("  ");
		}for(int j=1;j<=i;j++) {
			System.out.print(" *");
		}System.out.println();
	}
	}
public static void main(String[] args) {
	BshapeReverse obj = new BshapeReverse();		
obj.A();
obj.B();
obj.C();
obj.D();
}
}

