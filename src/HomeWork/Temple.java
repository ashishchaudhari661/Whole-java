package HomeWork;
public class Temple {
	public  void temple1() {
	int n=5;
	for(int i=1;i<=5;i++) {
		for(int j=5;j>=i;j--) {
			System.out.print(" ");
		}for(int j=1;j<=i;j++) {
			System.out.print("* ");
		}System.out.println();
	}
}public void temple2() {
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=5;j++) {
		System.out.print(" *");	
		}System.out.println();
}
	}public static void main(String[]args) {
	Flage.flage1();
	Flage.flage2();
	Temple obj =new Temple();
	obj.temple1();
	obj.temple2();
	}
}