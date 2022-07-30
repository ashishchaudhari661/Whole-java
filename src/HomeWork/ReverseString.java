package HomeWork;

public class ReverseString {
	public static void main(String[] args) {
		String a= "ashish";
		int len= a.length();
	//	System.out.println(len);
		for(int i=len-1;i>=0;i--) {
			System.out.println(a.charAt(i));
		}
	}

}
