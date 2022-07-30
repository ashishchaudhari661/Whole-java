package WHOLEJAVA;
import java.util.Scanner;
public class A3 {
	public static void main(String[]args) {
		Scanner obj= new Scanner(System.in);
		System.out.print("enter your marks =  ");
		int marks =obj.nextInt();
		if (marks>90) {
			System.out.println("you have A+ grade");
		}else if(marks>60){
			System.out.println("you have first class");
		}else if(marks>40) {
			System.out.println("you have second class");
		}else {
			System.out.println("you are fail");
		}
	}
}
