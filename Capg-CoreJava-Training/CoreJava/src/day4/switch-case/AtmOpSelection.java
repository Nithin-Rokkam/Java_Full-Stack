import java.util.*;
class AtmOpSelection 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		long AccNo=123456789;
		double bal=0;
		while(true){
			System.out.print("ATM Operations\n1.Withdraw\n2.Deposit\n3.Bal-Enquiry\n4.Exit\nSelect the operation to perform: ");
			int choice = sc.nextInt();
			switch(choice){
				case 1:
					System.out.println("Enter the amount to Withdraw: ");
					int WithdrawAmount = sc.nextInt();
					if(WithdrawAmount>0 && WithdrawAmount<bal){
						System.out.println("Withdrawl successful\n\n");
						bal-=WithdrawAmount;
					}else{
						System.out.println("Enter the valid amount");
					}
					break;
				case 2:
					System.out.println("Enter the account number: ");
					long userAccNo=sc.nextLong();
					if(userAccNo==AccNo){						
						System.out.println("Enter the amount to Deposit: ");
						double DepositAmount = sc.nextDouble();
						if(DepositAmount>0){
							bal+=DepositAmount;
						}
					}
					sc.nextLine();
					break;
				case 3:
					System.out.println("Balance :"+ bal +"\n\n");
					break;
				case 4:
					System.out.println("Thank-you\n\n");
					return;
				default:
					System.out.println("Enter the valid choice");
			}
		}
		
	}
}
