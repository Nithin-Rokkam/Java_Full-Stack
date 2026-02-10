import java.util.*;
class  L1
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		boolean isFlag=true;
		do{
			System.out.println("Demo");
			isFlag=false;
			//break;
		}while(isFlag);
		
		while(true){
			System.out.println("TEST while");
			break;
		}
		do{
			System.out.println("Hello");
			//inbuild Func
			// return type int , we can place any int inside the parameter and when ever we use this 
			//then the whole program is terminated and the next statements arent excuited and gives a CTE error: unreachable statement
			System.exit(0);
		}while(true);
		
		
		//System.out.println("Hello World!");
	}
}
