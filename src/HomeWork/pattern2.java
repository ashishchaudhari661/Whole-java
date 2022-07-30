package HomeWork;

public class pattern2 {
	public void pattern2() {
	int n=5;
	for(int i=5;i>=1;i--) {
		for(int j=5;j>=i;j--) {
			System.out.print(" ");
		}for(int k=1;k<=n;k++) {
			System.out.print("*");
		}System.out.println();
	}
}public static void main(String[] args) {
	pattern2 obj = new pattern2 ();
	obj.pattern2();
}

}
