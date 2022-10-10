package finakexam;

import java.util.Scanner;

public class billgeneration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int pir=100,pur=20,cr=10;
		System.out.printf("ENter the no of pizzas bought:");
		int pi=sc.nextInt();
		System.out.println();
		System.out.printf("ENter the no of puffs bought:");
		int pu=sc.nextInt();
		System.out.println();
		System.out.printf("ENter the no of cool drinks bought:");
		int c=sc.nextInt();
		System.out.println();
		
		int total=(pir*pi)+(pu*pur)+(cr*c);
		System.out.println("Bill Details");
		System.out.println("No of pizzas:"+pi);
		System.out.println("No of puffs:"+pu);
		System.out.println("No of cool drinks:"+c);

		System.out.println("Total price="+total);
		System.out.println("ENJOY THE SHOW!!!");
	}

}
