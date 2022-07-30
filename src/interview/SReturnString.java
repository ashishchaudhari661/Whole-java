package interview;

public class SReturnString {
public static void main(String[] args) {
	String b="hello everyone i am new here";
	int len=b.length();							//return String
	for(int i=len-1;i>=0;i--) {
		System.out.print(b.charAt(i));
	}
}
}
