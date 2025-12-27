import java.util.*;
class Calculator
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("----------------CALCULATOR-------------\n1.Add\n2.Sub\n3.Mul\n4.Div\n");
		System.out.print("Enter the choice of operation: ");
		int choice=sc.nextInt();
		switch(choice){
			case 1:
				System.out.print("Enter 1st number: ");
				int addnum1=sc.nextInt();
				System.out.print("Enter 2nd number: ");
				int addnum2=sc.nextInt();
				System.out.println("Result: "+ (addnum1+addnum2));
				break;
			case 2:
				System.out.print("Enter 1st number: ");
				int subnum1=sc.nextInt();
				System.out.print("Enter 2nd number: ");
				int subnum2=sc.nextInt();
				System.out.println("Result: "+ (subnum1-subnum2));
				break;
			case 3:
				System.out.print("Enter 1st number: ");
				int mulnum1=sc.nextInt();
				System.out.print("Enter 2nd number: ");
				int mulnum2=sc.nextInt();
				System.out.println("Result: "+ (mulnum1*mulnum2));
				break;
			case 4:
				System.out.print("Enter 1st number: ");
				int divnum1=sc.nextInt();
				System.out.print("Enter 2nd number: ");
				int divnum2=sc.nextInt();
				System.out.println("Result: "+ (divnum1/divnum2));
				break;
			default:
				System.out.print("Invalid Input");
		}
	}
}
