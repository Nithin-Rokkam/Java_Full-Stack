import java.util.Scanner;
import java.util.Arrays;
class EvenAvg 
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
		int count=0;
		for(int i=0;i<arr.length;i++){
			if (i%2==0)
			{
				count++;
				res+=arr[i];
			}
		}
		System.out.print("The Avg is: "+(double)(res/count));
	}
}
