package velocity;

public class NonPrimitive2 {public static void main(String[]args) {
	String a="velocity";
	String b="katraj";
	
	char i = a.charAt(3); // to get the index value of string by keyeword charAt.
//	System.out.println(i);
	
	int j =a.length(); // to check the length of string.
//	System.out.println(j);
	
	boolean k =a.contains("city"); // check the required character sequence present or not. 
//	System.out.println(k);
	
	boolean equal =a.equals(b); // to check the equality of string with another string
//	System.out.println(equal);
	
	String m = b.substring(0,5);// to break the string consider ( <5 )
	System.out.println(m);
	
	String n = b.concat(a);// used to connect two strings
//	System.out.println(n);
	
	String p = a.toUpperCase();// used to convert all letter of string into uppercase
//	System.out.println(p);
	
	String Q = b.toLowerCase(); // used to convert all letter of string into lowercase
//	System.out.println(Q);

	for (int z=(j-1);z>=0;z--) {
//		System.out.print(a.charAt(z));
	}
}
}
