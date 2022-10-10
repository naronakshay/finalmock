package finakexam;

import java.util.Scanner;

class Ticket{
	private int ticketid;
	private int price;
	static int availableTickets;
	private int getTicketid() {
		return ticketid;
	}
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public static int getAvailableTickets() {
		return availableTickets;
	}
	public static void setAvailableTickets(int availableTickets) {
		if(availableTickets<=0)
			System.out.println("ENTER VALID INPUT");
		else
			Ticket.availableTickets = availableTickets;
	}
	
	public int callculateTicketCost(int n)
	{
		if(availableTickets>n)
		{
			availableTickets=availableTickets-n;
			return n*price;
		}
		
		return -1;
	}
	
}


public class ticketprice {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of bookings:");
		int b=sc.nextInt();
		System.out.println("Enter the available tickets:");
		int t=sc.nextInt();
		
		Ticket o=new Ticket();
		o.setAvailableTickets(t);
		for(int i=0;i<b;i++)
		{
			System.out.println("Enter the ticketid:");
			int tid=sc.nextInt();
			System.out.println("Enter the price");
			int p=sc.nextInt();
			System.out.println("Enter the no of tickets");
			int n =sc.nextInt();
			o.setPrice(p);
			o.setTicketid(tid);
			
			
			System.out.println("Available tickets:"+o.getAvailableTickets());
			
			System.out.println("Total Amount"+o.callculateTicketCost(n));
			System.out.println("Available ticket after booking:"+o.getAvailableTickets());
			
		}
		
		
		
		
		
		
		
		
	}

}
