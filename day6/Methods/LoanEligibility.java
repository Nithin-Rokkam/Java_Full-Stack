import java.util.*;
class LoanEligibility 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Credit Score: ");
		int Cibil=sc.nextInt();
		System.out.print("Enter the monthly Income: ");
		double income=sc.nextDouble();
		System.out.print("Enter any existing loan intrest: ");
		double EIntrest=sc.nextDouble();
		System.out.print("Enter the Loan amount: ");
		double LAmount=sc.nextDouble();
		System.out.print("Enter any tenure(in months): ");
		int tenure=sc.nextInt();
		String res=transaction(income,Cibil,LAmount,EIntrest,tenure);
		System.out.println("Result: "+res);
	}
	
	public static String transaction(double income,int Cibil,double LAmount,double EIntrest,int tenure){
		if(Cibil>=650){
			double rate=0.10/12;
			double avail_EMI= (income*70/100)-EIntrest;
			double Pay_emi = LAmount * ((rate * Math.pow((1+rate),tenure)) / (Math.pow((1+rate),tenure) - 1));
			if(Pay_emi>avail_EMI){
				return "Exceeding Current EMI limit. Please increase or adjust loan amount";
			}else{
				return "Eligible for loan. Loan Emi is "+Pay_emi+" total amount to be paid is"+(Pay_emi*tenure);
			}
		}else{
			return "Not Eligible for Loan";
		}
	}
}
