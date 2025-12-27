import java.util.*;
class WorkSchedule
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Day of the Week: ");
		int day = sc.nextInt();
		switch(day){
			case 1:
				System.out.print("Weekday-Monday");
				break;
			case 2:
				System.out.print("Weekday-Tuesday");
				break;
			case 3:
				System.out.print("Weekday-Wednesday");
				break;
			case 4:
				System.out.print("Weekday-Thursday");
				break;
			case 5:
				System.out.print("Weekday-Friday");
				break;
			case 6:
				System.out.print("Weekend-Saturday");
				break;
			case 7:
				System.out.print("Weekend-Sunday");
				break;
			default:
				System.out.print("Enter valid Input");
				break;
		}
	}
}
