package interview;

public class SDuplicateChar {
public static void main(String[] args) {
int count=1;
String str="everyone";
for(int i=0;i<str.length();i++) {
	for(int j=i+1;j<str.length();j++) {
		if(str.charAt(i)==str.charAt(j)) { 
			System.out.println("duplicate charecters are :"+str.charAt(j));
}
}
}
}
}


