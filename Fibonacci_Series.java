package interview;
import java.util.Scanner;

public class Fibonacci_Series {
	public static void main(String[] args) {
		
	 int num=10, a = 0,b=0, c=1; 		
   //  Scanner in = new Scanner(System.in);
    // System.out.println("Enter the number of times");
     //num = in.nextInt();
     //System.out.println("Fibonacci Series of the number is:");
     for (int i=0; i<=num; i++) {
         a = b; // a=0> 1
         b = c; // b=1> 1/ /2=1
         c = a+b; //1+2 >3  // 2 1 > 3 ,1+ 3> 4, 3+4>7, 4+7>11, 
        // System.out.println(a+"\t"+b+"\t"+c); 
         System.out.print("\n"+a);
    // String abc = "kadhir";
     System.out.print("");

}
}
}

 