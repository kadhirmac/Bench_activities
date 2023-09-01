package interview;

import java.util.*;

public class PrimeNumber {

	
/**
 * @param args
 */
public static void main(String[] args) {
//	int num = 50;
//	for(int i=1; i <=num; i++)
//	{
//		if (num%2==0)
//		{
//			System.out.println(i);
//		}
//		//System.out.print(i);
//		
//	}
	
	/*If b is false, it means that the number no was not found to be divisible by any number in the loop's range. Therefore, the number is prime, and the message "is a prime" is printed.
	 *If b is true, it means that the number no was found to be divisible by at least one number in the loop's range. Therefore, the number is not prime, and the message "is not prime" is printed. */
	
	int no=17;
	boolean b=false;
	for(int i=2; i<=no/2; i++) {
		if(no%i==0) {
			b=true;
			break;
		}
	}
	if(!b) 
		System.out.println(no+ "is a prime");
	else
		System.out.println(no+"no is not prime");
	
	
//	//Factorial 
//	
//	int number = 2;
//	int fact =1;
//	for(int i =1; i<=number; )
//	{
//		fact=fact*i;
//		i++;
//	}
//	System.out.println(fact);


//Array list 
//	List<String> ls =new ArrayList<String>();
//	ls.add("Kadhir");
//	ls.add("nagarajan");
//	System.out.println(ls);
//	
//	//length of word:
//	
String word ="Pondicherry";
int[] n = {2,3,4,5,6};
Arrays.sort(n);
int len =n.length;
//n.length;
System.out.println(word.length());
System.out.println(n.length);




//	System.out.println(word.length());
	
	
	//vowels 
//	
//	System.out.println(containsVowels(word));
//	





}


}

