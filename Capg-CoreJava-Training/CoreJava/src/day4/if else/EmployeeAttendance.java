import java.util.*;
class EmployeeAttendance 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Present Hours: ");
		int Hours = sc.nextInt();
		if(Hours>=8){
			System.out.println("Present");
		}else if(Hours>=4 && Hours<=8){
			System.out.println("Half-day Present");
		}else if(Hours<4){
			System.out.println("Absent");
		}
	}
}
