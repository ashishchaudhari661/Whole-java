package WHOLEJAVA;

public class A10NonPrimitive {
		public static void main(String[] args) {
			String a="ashish is bad boy";			//string by using literal way
			String z= " only one raje is good guy";
			char i=a.charAt(5);
			System.out.println(i);
			
			int b=a.length();
			System.out.println(b);
			
			boolean c=a.contains("bad");
			System.out.println(c);
			
			String d=a.substring(5,11);
			System.out.println(d);
			
			String e=a.toUpperCase();
			System.out.println(e);
			
			String f=a.toLowerCase();
			System.out.println(f);
			
			boolean n=a.equals(z);
			System.out.println(n);
			
			String k=a.concat(z);
			System.out.println(k);
			
			String t=new String(" hello ashsih");	// string by using new keyword
			System.out.println(t);
			
		for(int m=(b-1);m>0;m--) {
			System.out.print(a.charAt(m));
		}

			
			
			
			
			
			
			
			
			
			
		}
}
