package HomeWork;

public class Shweta extends Papa {
	
public  void pravin() {
	int a=10;
	System.out.println(a);
}
public void ashish() {
	//this.pravin(); 	// to call the current class method
	//super.pravin(); 	//to call parent class method
}
public static void main(String[] args) {
	Shweta obj=new Shweta();
	obj.ashish();
	}
}