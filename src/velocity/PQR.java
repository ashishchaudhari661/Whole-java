package velocity;

public class PQR implements Abc {
	public void jtm() {
		System.out.println("hi dhiru");
	}
	public void ssbt() {
		System.out.println(" hi everyone");
	}
	public void jalgaon() {
		System.out.println(" hello");
	}
	public void muktainagar() {
		System.out.println(" hello muktainagar");
	}
//	public static void main(String [] args) {
//		PQR obj = new PQR();
//		obj.jalgaon();
//	}
	public static void main (String[] args) {
		Abc obj = new PQR();					// object of interface using constructor
		obj.ssbt();								// of implimentation class
	}
}
