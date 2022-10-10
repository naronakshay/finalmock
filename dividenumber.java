package finakexam;

import java.util.Scanner;

class Division{
	
	String s="";
	public String divideTwoNumber(int n1,int n2) {
		try {
			float z=n1/n2;
			s="The answer is "+z;
			
		}
		catch(ArithmeticException e)
		{
			s=s+e;
		}
		
		return s;
		
	}
}

public class dividenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int n =sc.nextInt();
		System.out.println("Enter the second number ");
		int n2=sc.nextInt();
		
		Division d=new Division();
		String re=d.divideTwoNumber(n, n2);
		System.out.println(re.concat("Thanks for using the application"));
	}

}
