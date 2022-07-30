package HomeWork;

public class HollowPyramid {public void HP1(){
	int n =6;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n-i;j++) {
			System.out.print(" ");
		}for(int j=1;j<=i;j++) {
			if(j==1 || j==i ) {
				System.out.print("* ");
			}else {
				System.out.print("  ");
			}
		}System.out.println();
	}
}public static void main(String[] args) {
	HollowPyramid obj = new HollowPyramid();
	obj.HP1();
}

}
