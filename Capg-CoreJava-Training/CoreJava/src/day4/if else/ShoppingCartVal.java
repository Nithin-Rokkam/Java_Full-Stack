import java.util.*;
class  ShoppingCartVal
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter cart items: ");
		int cartItems = sc.nextInt();
		System.out.print("Enter the pincode (530011/ 100011/ 122110): ");
		int pincode = sc.nextInt();
		if(cartItems>0 && (pincode==530011 || pincode==100011 || pincode==122110 )){
			System.out.println("Checkout confirmed");
		}else{
			System.out.println("Invalid cart or adderss code");
		}
	}
}
