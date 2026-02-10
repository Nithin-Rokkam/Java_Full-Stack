import java.util.*;
class  Printonly5
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter M val: ");
		int M=sc.nextInt();
		System.out.print("Enter N val: ");
		int N=sc.nextInt();
		int count=0;
		for(int i = M; i < N; i++){
			boolean flag=false;
			int res=i;
			while(res>0){
				int temp=res%10;
				if(temp==5){
					flag=true;
					break;
				}
				res/=10;
			}
			if(flag) count++;
		}
		System.out.println("The count of num between M and N including only 5 are: "+count);
	}
}
