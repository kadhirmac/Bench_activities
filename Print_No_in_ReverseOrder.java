package interview;

import java.util.Arrays;
import java.util.*;
import java.util.stream.*;

public class Print_No_in_ReverseOrder {
	public static void main(String[] args) {

		
		//Printing Numbers in Reverse order
		
		int no=1234 ;
		
		while(no>0) {
		int rem =no%10;
		System.out.println("reverse order of "+rem);
		no=no/10;
		}
		
		List<Integer> list = Arrays.asList(32,23,12,2,45,53,3,1); 
		list.stream().sorted().forEach(System.out::print);
	//	list.stream().sorted(Collections.reverseOrder()).forEach(System.out::print);
	}

}
