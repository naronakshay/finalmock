package finakexam;

import java.util.Scanner;

class Candidate1{
	private String name;
	private String gender;
	private double expectedSaalary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getExpectedSaalary() {
		return expectedSaalary;
	}
	public void setExpectedSaalary(double expectedSaalary) {
		this.expectedSaalary = expectedSaalary;
	}
	
}

class InvalidSalaryException extends Exception{
	public InvalidSalaryException(String s) {
		super(s);
	}
}


public class accountexception {
	
	
	public static Candidate1 getCandidateDetails() throws InvalidSalaryException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the candidate Details");
		System.out.println("Name");
		String name=sc.next();
		System.out.println("Gender");
		String gender=sc.next();
		
		
		Candidate1 o=new Candidate1();
		o.setGender(gender);
		o.setName(name);
		
		System.out.println("Expected Salary");
		double s=sc.nextDouble();
		
		if(s<10000)
		{
			throw new InvalidSalaryException("Registration Failed.Salary cannot be less than 10000");
			
		}
		else
		{
			o.setExpectedSaalary(s);
			return o;
		}
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			accountexception.getCandidateDetails();
			System.out.println("Registration Succesful");
			
		}
		catch(InvalidSalaryException e)
		{
			System.out.println(e.getMessage());
		}

	}

}
