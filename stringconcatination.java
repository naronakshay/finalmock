package finakexam;

import java.util.Scanner;

public class stringconcatination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Inmates Name :" );
		String fn=sc.nextLine();
		System.out.println("Inmates father's name:");
		String ln=sc.nextLine();
		
		String last = fn+" "+ln;
		if(last.matches(".*\\d+.*"))
			System.out.println("Invalid name");
		else
			System.out.println(last.toUpperCase());
		
		
	}

}
