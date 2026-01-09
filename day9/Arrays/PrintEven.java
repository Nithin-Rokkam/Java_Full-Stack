import java.util.Scanner;
import java.util.Arrays;
class PrintEven 
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
		for(int i=0;i<arr.length;i++){
			if(i%2==0){
				System.out.println("The even index elements are: "+arr[i]);
			}
		}
	}
}
