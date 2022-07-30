package velocity;

public class NonPrimitive {public static void main(String[]args) {
	String a = "velocity" ;// string by literal way
	String c = "velocity";
	
	//if we declare same value of string then they are not allocate the different memory.
	
	String b = new String("katraj"); // string by new keyword
	
	System.out.println(a);
	System.out.println(c);
	System.out.println(b);
}

}
