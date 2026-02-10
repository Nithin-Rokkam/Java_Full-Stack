import java.util.*;
class ShopDiscount 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of units required: ");
		int requirement = sc.nextInt();
		System.out.print("Enter the cost per unit: ");
		int unit = sc.nextInt();
		int total = requirement * unit;
		if(total>1000){
			int res = total-(total*10/100);
			System.out.println("The final amount to be paid is: " + res);
		}else{
			int res = total;
			System.out.println("The final amount to be paid is: " + res);
		}
	}
}
