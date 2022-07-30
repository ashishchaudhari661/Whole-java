package velocity;

public class POlymorphism2 extends Polymorphism {
	public void ashish() {
		System.out.println("i am ovrriding");
	}
	public void B() {
		System.out.println(" i am BBB");
	}
	public static void main(String[] args) {
		POlymorphism2 obj = new POlymorphism2();
		obj.ashish();
		obj.shubham(null);
	}
}
