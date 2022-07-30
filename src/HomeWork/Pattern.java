package HomeWork;

public class Pattern {
	public void pattern() {
		int n=5;
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(" ");
			}for(int k=1;k<=n;k++) {
				System.out.print("*");
			}System.out.println();
		}
	}public static void main(String[] args) {
		Pattern obj =new Pattern();
		obj.pattern();
	}

}
