
package day5.Loops;

import java.util.*;
class AltReminder
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the dividend: ");
		int m=sc.nextInt();
		System.out.print("Enter the divisor: ");
		int n=sc.nextInt();
		int temp=m;
		while(temp>=n){
			temp-=n;
		}
		System.out.println("The Quotient of "+m+" & "+n+" = "+(temp));
		sc.close();
	}
}
