import java.util.*;
class AccountStatus 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int maxLimTrans = 5;
		int MinBal_HDFC = 4000;
		int MinBal_SBI = 2000;
		int MinBal_ICIC = 8000;
		
		System.out.print("Select your bank (HDFC, SBI, ICIC): ");
		String bank = sc.next();
		System.out.print("Enter the balance: ");
		int bal = sc.nextInt();
		System.out.print("Enter the number of Transactions: ");
		int Transactions = sc.nextInt();
		int TransacAmountLimit = 100000;
		if(bank.equals("HDFC")){
			if(bal>=MinBal_HDFC){
				System.out.println("Account active");
				System.out.print("Enter Transaction Amount: ");
				int TransacAmount = sc.nextInt();
				if(Transactions<=maxLimTrans && TransacAmount<=bal && TransacAmount<=TransacAmountLimit){
					System.out.println("Transaction successful");
				}else{
					System.out.println("Account Frozen");
				}
			}else if(bal<MinBal_HDFC){
				System.out.println("Low Balance");
			}
		}else if(bank.equals("SBI")){
			if(bal>=MinBal_SBI){
				System.out.println("Account active");
				System.out.print("Enter Transaction Amount: ");
				int TransacAmount = sc.nextInt();
				if(Transactions<=maxLimTrans && TransacAmount<=bal && TransacAmount<=TransacAmountLimit){
					System.out.println("Transaction successful");
				}else{
					System.out.println("Account Frozen");
				}
			}else if(bal<MinBal_SBI){
				System.out.println("Low Balance");
			}
		}else if(bank.equals("ICIC")){
			if(bal>=MinBal_ICIC){
				System.out.println("Account active");
				System.out.print("Enter Transaction Amount: ");
				int TransacAmount = sc.nextInt();
				if(Transactions<=maxLimTrans && TransacAmount<=bal && TransacAmount<=TransacAmountLimit){
					System.out.println("Transaction successful");
				}else{
					System.out.println("Account Frozen");
				}
			}else if(bal<MinBal_ICIC){
				System.out.println("Low Balance");
			}
		}
	}
}
