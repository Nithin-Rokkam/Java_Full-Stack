import java.util.*;
class HappyNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number1: ");
		int num=sc.nextInt();
		System.out.print("Enter the number2: ");
		int num2=sc.nextInt();
		int count=0;
		for(int i=num;i<=num2;i++){
			if(happyNum(i)){
				count++;
				System.out.println("The happy numbers are "+i);
			}	
		}
		System.out.println("The total happy numbers are "+count);
	}
	
	public static boolean happyNum(int num){
		while (num>9)
		{
			int res=0;
			int temp=num;
			while(temp>0){
				int ntemp=temp%10;
				res+=Math.pow(ntemp,2);
				temp/=10;
			}
			num=res;
		}
		if (num==1 || num==7) {
			return true;
		} else {
			return false;
		}
	}
}
