package velocity;

public class Nonprimitive3 {public static void main(String[] args) {
int [] a = {10,20,30,40,50};
int b [] = {50,40,30,20,10};

String [] s= {"dhiraj","shubham","ashish"};

System.out.println(a [4]); //array is also in index form
System.out.println(b[3]);

int x= s.length;
System.out.println(x);

int[]c;  //infinite size array
c =new int [] {1,2,3,4,5,6,7,8,9}; // initialization methods

int[] d= new int [10];   // fixed size array

d[0]=90; // this assin the value to array at perticular index
d[1]=20;
d[3]=40;
d[2]=30;

System.out.println(d[0]);
}
}
