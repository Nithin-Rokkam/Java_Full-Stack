import java.util.Scanner;
import java.util.Arrays;
class Secmax 
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
		int max=arr[0];
		int smax=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				smax=max;
				max=arr[i];
			}else if(arr[i]>smax && arr[i]!=max){
				smax=arr[i];
			}
		}
		return smax;
	}
}
