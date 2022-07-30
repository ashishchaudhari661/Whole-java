package velocity;

public class Child extends  Parent {
			public void test() {
				System.out.println("i am child class");
				super.test();
			}
			public static void ashish() {
				System.out.println(" i am static child class");
}
			public void test1() {
				super.test();		// for calling the parent class method 
			   this.test();		// for calling the child class method
			}
			public static void main(String [] args) {
				Child obj = new Child();
				//obj.test();				// when we call the same name method which 
										//	are present in both class parent & child 
										//then they give priority for child class
			obj.test1();
			Child.ashish();			// we can not override the static method because it  directly bonded to its body.
									// it is not depend on object
									// also we are called method hiding concept
			Parent.ashish();
			
			}	
	}