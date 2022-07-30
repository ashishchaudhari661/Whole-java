package WHOLEJAVA;
import java.util.Scanner;
public class A4 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("how many wheels are in car = ");
		int wheels =obj.nextInt();
		System.out.println();
		System.out.print("how many seats are in car = ");
		int seats =obj.nextInt();
		System.out.println();
		System.out.print("car must be elecric = ");
		boolean fuel =obj.nextBoolean();
		
		if (wheels >4) {
			if(seats>4) {
				if(fuel==true) {
					System.out.println("we can buy car");
				}else {
					System.out.println("we can not");
						} 
				} else {
					System.out.println("we can not");
				}
			}else {
				System.out.println("we can not");
		}
	}
	}