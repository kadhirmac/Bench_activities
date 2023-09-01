package interview;
import java.util.*;

public class Pallindrome {
	public static void main(String[] args) {
		

		//1.reversing the string
		String str = "AMMA";
		String str2 = "";
		System.out.println("length of string : "+str.length());
		for (int i=str.length()-1; i>=0; i--) // 3
		{
			System.out.print(str.charAt(i));
			//str storing the reverse char of name using charAt method.
			str2=str2+ str.charAt(i);
			
		}
		System.out.println("\n"+str2);
		//pallindrom
		if(str.equals(str2))
		{
			System.out.println("pallindrom");
		}
		else
		{
			System.out.println("not pallindrome");
		}
		
		
	System.out.println("enter string to reverse and pallindrome");
	Scanner get =new Scanner(System.in);
	String word = get.nextLine();
	String word2="";
	System.out.println(word);
	for( int i=word.length()-1; i>=0; i--)
	{
		word2= word2+word.charAt(i);
	}
	System.out.println(word2);
	if(word.equals(word2))
	{
		System.out.println("pallindrom");
		
	}
	else
	{
		System.out.println("not pallindrome");
	}
		
		System.out.println(word.equals(word2));
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
	}

}
