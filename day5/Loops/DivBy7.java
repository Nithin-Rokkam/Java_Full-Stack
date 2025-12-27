import java.util.*;
class  DivBy7
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter M val: ");
		int M=sc.nextInt();
		int res=0;
		System.out.print("Enter N val: ");
		int N=sc.nextInt();
		for(int i=M;M<N;M++){
			if(M%7==0){
				System.out.println("Even val between M & N: "+M);
			}
		}
	}
}
