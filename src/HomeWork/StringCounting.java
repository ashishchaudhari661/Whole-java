package HomeWork;

public class StringCounting {
	public static void main(String[] args) {
		int d=0;
		String a = "ashish is gtreat guy is college";
		int len = a.length();
	//	System.out.println(len);
		for(int i=0;i<=len-1;i++) {
		if((a.charAt(i)==' ') && (a.charAt(i+1) !=' '))	{
			++d;
		}
	}	
		System.out.println( + d);
	System.out.println(len-d);

	}
}
