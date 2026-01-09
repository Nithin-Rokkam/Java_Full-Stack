import java.util.Scanner;
import java.util.Arrays;
class firstHalfAvg
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int arr[] = new int[sc.nextInt()];
		System.out.print("Enter the element: ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int res=0;
		for(int i=0;i<arr.length/2;i++){
			res+=arr[i];
		}
		System.out.println("First half avg: "+res/(arr.length/2));
	}
}
