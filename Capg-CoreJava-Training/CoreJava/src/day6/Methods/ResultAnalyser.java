import java.util.*;
class ResultAnalyser 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the marks of Sub1: ");
		int sub1=sc.nextInt();
		System.out.print("Enter the marks of Sub2: ");
		int sub2=sc.nextInt();
		System.out.print("Enter the marks of Sub3: ");
		int sub3=sc.nextInt();
		String res=transaction(sub1,sub2,sub3);
		System.out.println("Result: "+res);
	}
	
	public static String transaction(int sub1,int sub2,int sub3){
		double avg = (sub1+sub2+sub3)/3;
		if(avg>80 && avg<=100){
			return "A";
		}else if(avg>70 && avg<=80){
			return "B";
		}else if(avg>60 && avg<=70){
			return "C";
		}else if(avg>50 && avg<=60){
			return "D";
		}else{
			return "F";
		}
	}
}
