package basic;

public class Array {
public static void main(String[] args) {
	int a[]= {2,5,8,6,4,7,6,5,0,1};
	int len=a.length;
	for(int i=0;i<len;i++) {
		 int x = (int)Array.get(a, i);
	}
}
}
