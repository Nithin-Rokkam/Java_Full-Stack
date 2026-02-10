import java.util.*;
class Shooping_Discount_calc
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the User_name: ");
		String Username=sc.next();
		System.out.print("Enter the user_subscription: ");
		String Subscription=sc.next();
		System.out.print("Enter the user_bill amount: ");
		double amount=sc.nextInt();
		String res=discount(Username,Subscription,amount);
		System.out.println(res);
	}
	
	public static String discount(String Username,String Subscription,double amount){
		double price = amount; 
		if(Subscription.equals("Regular")){
			if(amount>0 && amount<3000){
				price -=amount*10/100; 
			}else if(amount>5000){
				price -=amount*12/100; 
			}else{
				price -=amount*15/100; 
			}
		}else if(Subscription.equals("Premium")){
			if(amount>3000){
				price -=amount*15/100; 
			}else if(amount>5000){
				price -=amount*18/100; 
			}else{
				price -=amount*21/100; 
			}
		}else{
			return "Invalid Type";
		}
		return "The discount amount is "+price; 
	}
}
