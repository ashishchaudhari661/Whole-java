package HomeWork;
	import java.util.Scanner;
public class Scn {
	public static void main(String [] args) {
		Scanner ashu = new Scanner(System.in);
		
		String b= ashu.nextLine();
		
		System.out.println(b);
		
		System.out.println(" enter first number");
		
		int x= ashu.nextInt();
		
		System.out.println("enter second number");
		
		int z=ashu.nextInt();
		
		int y = x*z;
		
		System.out.println(y);
	}
}
