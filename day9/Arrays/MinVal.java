import java.util.Scanner;
import java.util.Arrays;
class MinVal 
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
		int min=arr[0];
		for (int i=1;i<arr.length;i++)
		{
			if(arr[i]<min){
				min=arr[i];
			}
		}
		System.out.print("Min element: "+min);
	}
}
