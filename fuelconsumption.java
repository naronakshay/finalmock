package finakexam;
import java.util.*;
public class fuelconsumption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of liters  to fill the tank");
		float l=sc.nextFloat();
		if(l<0 )
		{
			System.out.println(l+" "+"is an invalid input");
			
		}
		else
		{
			System.out.println("Enter the distance covered");
			float d=sc.nextFloat();
			if(d<0 )
				System.out.println(d+" "+"is an invalid input");
			else
			{
				float r1= (l/d)*100;
				System.out.println("Liters/100 KM ");
				System.out.printf("%.2f",r1);
				
				double l1= l*0.2642;
				double d1=d*0.6214;
				double r2=d1/l1;
				System.out.println();
				System.out.println("Miles/gallons");
				System.out.printf("%.2f",r2);
			}
		
		}
		
		
	
	}

}
