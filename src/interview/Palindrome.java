package interview;

public class Palindrome {
	public static void main(String[] args) {
	int r,sum=0;
	int n=54545;
	int num=n;
	while(n>0) {
		r=n%10;
		sum=(sum*10)+r;
		n=n/10;
	}
	if(num==sum) {
		System.out.println("this is palindrome number");
	}else{
		System.out.println("this is not");}
	}
	}
	

