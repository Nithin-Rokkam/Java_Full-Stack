import java.util.Scanner;
import java.util.Arrays;
class SortDec 
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
		
		sortArr(arr);
		System.out.print("Sorted Elements are: ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void sortArr(int arr[]){
		for(int i=0;i<arr.length;i++){
			int min =i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]>arr[min]){
					min=j;
				}
			}
			if(min!=i){
				int temp=arr[min];
				arr[min]=arr[i];
				arr[i]=temp;
			}
		}
	}
}
