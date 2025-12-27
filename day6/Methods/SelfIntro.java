import java.util.*;
class SelfIntro 
{	
	public static void main(String[] args) 
	{
		String Intro=Intro();
		System.out.println(Intro);
	}
	
	public static String Intro(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name: ");
		String name = sc.nextLine();
		System.out.print("Enter age: ");
		int age=sc.nextInt();
		System.out.print("Enter Ph-Num: ");
		long ph_no=sc.nextLong();
		return ("name is "+name+" age is "+age+" phno is "+ph_no);
	}
}
