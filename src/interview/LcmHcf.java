package interview;

import java.util.Scanner;

public class LcmHcf {
public static void main(String[] args) {
	int num1,num2,temp1,temp2,lcm,hcf,temp;
	Scanner scanner=new Scanner(System.in);
	System.out.println("eneter first number");
	num1=scanner.nextInt();
	System.out.println("enter second number");
	num2=scanner.nextInt();
	temp1=num1;
	temp2=num2;
	while(temp2 !=0) {
		temp=temp2;
		temp2=temp1%temp2;
		temp1=temp;
	}
	hcf=temp1;
	lcm=(num1*num2)/hcf;
	
	System.out.println("hcf of this numbers :"+hcf);
	System.out.println("lcm of this numbers :"+lcm);
}
}
