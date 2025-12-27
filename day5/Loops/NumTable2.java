import java.util.*;
class  NumTable2
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter number val: ");
		int num=sc.nextInt();
		int res=0;
		for(int i=1;i<=10;i++){
			res+=num;
			System.out.println(num+"*"+i+"="+res);
		}
	}
}
