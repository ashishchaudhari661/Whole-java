package velocity;

public class Nonprimitive4 {public static void main(String[] args) {
	String [] s= {"ashish","dhiraj","shubham","paresh"};
	
	String b= s[1];
	String c="";
	int len=b.length();
	
	 // for(int i=len-1;i>=0;i--) {
	//	System.out.println(b.charAt(i));
	//	}
	for(int j=len-1;j>=0;j--) {
		c =c +b.charAt(j);
	}if(c.equals(b)) {
		System.out.println("This are equal");
	}else {
		System.out.println("this are different");
	}
}
}
