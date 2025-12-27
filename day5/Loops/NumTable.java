import java.util.*;
class  NumTable
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter number val: ");
		int num=sc.nextInt();
		int res=1;
		for(int i=1;i<=10;i++){
			res=num*i;
			System.out.println(num+"*"+i+"="+res);
		}
	}
}
