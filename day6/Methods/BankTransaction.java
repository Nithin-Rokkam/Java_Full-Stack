import java.util.*;
class BankTransaction 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the acc_bal: ");
		double acc_bal=sc.nextDouble();
		System.out.print("Enter the withdrawl_amount: ");
		double withdrawl_amount=sc.nextDouble();
		String res=transaction(acc_bal,withdrawl_amount);
		System.out.println("Result: "+res);
	}
	
	public static String transaction(double acc_bal,double withdrawl_amount){
		if(withdrawl_amount>0 && withdrawl_amount<acc_bal){
			return "Transaction Successful";
		}else{
			return "Transaction Unsuccessful";
		}
	}
}
