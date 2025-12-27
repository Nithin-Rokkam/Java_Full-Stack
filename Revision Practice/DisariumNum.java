import java.util.*;
class DisariumNum 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number1: ");
		int num=sc.nextInt();
		System.out.print("Enter the number2: ");
		int num2=sc.nextInt();
		int count=0;
		for(int i=num;i<=num2;i++){
			if(isDisarium(i)){
				count++;
				System.out.println("The Disarium numbers are "+i);
			}	
		}
		System.out.println("The total Disarium numbers are "+count);
	}
	
	public static boolean isDisarium(int num){
		int dem1=num;
		int l=0;
		while(dem1>0){
			l++;
			dem1/=10;
		}
		double res=0;
		int temp=num;
		while(temp>0){
			int dem2=temp%10;
			res+=Math.pow(dem2,l);
			temp/=10;
			l--;
		}
		if(res==num){
			return true;
		}else{
			return false;
		}
	}
}
