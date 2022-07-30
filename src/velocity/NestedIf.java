package velocity;

public class NestedIf {
	public static void main(String[] args) {
		int wheel = 8;
		int seats = 10;
		boolean AC = true;
		if(wheel>6)
		{
			System.out.println("wheels are rights");
			
		if(seats>12) 
		{
			System.out.println("seats are ok");

		if (AC = false)
		{
			System.out.println(" it is ok for AC");
		}
		else {
			System.out.println("it is not ok for AC");
		}
		}
	    else
		{
			System.out.println("seats are not ok");
		}
		}
		else
		{
			System.out.println("wheels are not rihghts");
		}
	}

}
