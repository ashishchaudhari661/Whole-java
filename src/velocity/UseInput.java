package velocity;
	import java.util.Scanner;
public class UseInput {
	
	public static void main(String [] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.println(" enter first number");
		
		int a=obj.nextInt();
		
		System.out.println("enter second number");
		
		int b=obj.nextInt();
		
		int c= a+b;
		System.out.println();
		
		System.out.println("Ans ="+c);
		
	}
}
