package velocity;

public class Explicite {

	double  a=10.95;
						// explicit casting
	int b =(int) a;		// also known as narrowing
	
	public static void main(String [] args) {
		Explicite obj = new Explicite();
		System.out.println(obj.a);
		System.out.println(obj.b);
		
	}
}
