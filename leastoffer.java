package finakexam;

import java.util.Scanner;

public class leastoffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int c=sc.nextInt();
		String ar [][]=new String [c][3];
		
		for(int i=0;i<c;i++) {
			String item=sc.next();
			ar[i]=item.split(",");
			
		}
		
	
		
		int dis []=new int [c];
		
		for(int i=0;i<c;i++)
		{
			for(int j=0;j<3;j++)
			{
				dis[i]= Integer.valueOf(ar[i][1])*Integer.valueOf(ar[i][2])/100;
			}
		}
		
		int small =dis[0];
		for(int j=0;j<dis.length;j++) {
			if(dis[j]<small)
				small=dis[j];
		}
		
		for(int i=0;i<dis.length;i++)
		{
			if(dis[i]==small)
			{
				System.out.println(ar[i][0]);
			}
		}
		
	}
}

