import java.util.Scanner;
class MovieRatingSystem 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the movie rating(1 to 4): ");
		
		int rating = sc.nextInt();
		
		switch (rating)
		{
			case 1:
				System.out.println("Your rated the movie is poor!");
			    break;
			
			case 2:
				System.out.println("Your rated the movie is Average!");
			    break;
				
			case 3:
				System.out.println("Your rated the movie is Good!");
			    break;
				
			case 4:
				System.out.println("Your rated the movie is Excellent!");
			    break;
				
			default:
				System.out.println("Enter the valid rating!!");
			    break;
		}
	}
}
