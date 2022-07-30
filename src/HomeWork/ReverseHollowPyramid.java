package HomeWork;

public class ReverseHollowPyramid {public void HP2(){
	int n=6;
	for(int i=5;i>=1;i--) {
		for(int j=1;j<=n-i;j++) {
			System.out.print(" ");
		}for(int j=1;j<=i;j++)
		{if(j==i || j==1) 
		{
			System.out.print("* ");
		}else {
			System.out.print("  ");
		}
		}System.out.println();
	}
	}public static void main(String[] args) {
		ReverseHollowPyramid obj = new ReverseHollowPyramid();
		obj.HP2();
	}
}


