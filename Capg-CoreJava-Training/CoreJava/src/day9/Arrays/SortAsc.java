import java.util.Scanner;
import java.util.Arrays;
class SortAsc 
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
			for(int j=i+1;j<arr.length;j++){
				int temp=arr[i];
				if(arr[i]<arr[j]){
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
}
