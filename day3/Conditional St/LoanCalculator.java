class LoanCalculator 
{
	public static void main(String[] args) 
	{
		double p=500000;
		double r=10;
		double t=5;
		double interest = (p*t*r)/100;
		double totalAmount = p+interest;
		double emiPerMonth=(totalAmount/5)/12;
		System.out.println("Interest for 5 years " + interest);
		System.out.println("Total Amount to be paid " + totalAmount);
		System.out.println("EMI per month " + emiPerMonth);
	}
}
