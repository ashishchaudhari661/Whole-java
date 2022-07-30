package interview;

public class SReverseWords {
public static void main(String[] args) {
	String str="hello everyone i am ashish";
	String word[]=str.split(" ");
	for(int i=word.length-1;i>=0;i--) {
		System.out.print(word[i]+" ");
	}
	
}
}
