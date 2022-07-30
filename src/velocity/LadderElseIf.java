package velocity;

public class LadderElseIf {
	public static void main(String[] args) {
		int marks=85;
		if(marks>=90) 
		{
			System.out.println("you have A+ grade");
		}else if(marks>=80) 
		{
		System.out.println("you have A grade");
		}else if (marks>=70) 
		{
			System.out.println("you have B+ grade");
		}else if(marks>=60) 
		{
		System.out.println("you have B grade ");
		}else if (marks>=50) 
		{
			System.out.println("you have C + grade");
		}else if (marks>=40)
		{
			System.out.println("you have D grade");
		}else {
			System.out.println("you are fail");
		}
			
	}
}
