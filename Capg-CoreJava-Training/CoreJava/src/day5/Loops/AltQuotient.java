
package day5.Loops;

import java.util.*;
class AltQuotient 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the dividend: ");
		int m=sc.nextInt();
		System.out.print("Enter the divisor: ");
		int n=sc.nextInt();
		int temp=n;
		int count=0;
		while(m>=temp){
			temp+=n;
			count++;
		}
		System.out.println("The Quotient of "+m+" & "+n+" = "+(count));
		sc.close();
	}
}
