import java.util.Scanner;
import java.util.Arrays;
class SecMin 
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
		int Secmax=secLargest(arr);
		System.out.print("Second largest element: "+Secmax);
	}
	
	public static int secLargest(int arr[]){
		int min=arr[0];
		int smin=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<min){
				smin=min;
				min=arr[i];
			}else if(arr[i]<smin && arr[i]!=min){
				smin=arr[i];
			}
		}
		return smin;
	}
}
