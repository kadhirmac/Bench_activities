package interview;

public class Armstrong_Number {
	public static void main(String[] args) {
	
		int no=153, arm=0,no2=no;
		do {
		int rem =no%10;
		arm=arm+(rem*rem*rem);
		no=no/10;
		}while(no>0);
		if(no2==arm)
		{
			System.out.println("armstrong no");
		}
		else
			System.out.println("non armstrong no");
	}

}
