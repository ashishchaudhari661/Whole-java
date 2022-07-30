package basic;

public class DemoMethods {
	public void ashish() //Method declaration is non static method 
	{
		System.out.println(" good morning all");
	}

	public static void main(String[] args) {
		
		DemoMethods obj = new DemoMethods();
		
		obj.ashish();// wehave to call method inside main method for excution
	}
}
