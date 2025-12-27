import java.util.*;
class OnlineCabBooking 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("driver availability: ");
		boolean driver= sc.nextBoolean();
		if(driver){
			System.out.print("Select Location (Jalandhar/Ludhiana/LPU/Phagwarah): ");
			String userLocation = sc.next();
			if(userLocation.equals("Jalandhar") || userLocation.equals("Ludhiana") || userLocation.equals("LPU") || userLocation.equals("Phagwarah")){
				System.out.print("Select Payment Mode (UPI/cash/card): ");
				String PaymentMode= sc.next();
				if(PaymentMode.equals("UPI") || PaymentMode.equals("cash") || PaymentMode.equals("card")){
					System.out.println("Cab Booked Successfully...");
				}else{
					System.out.println("Select valid Payment Mode");
				}	
			}else{
				System.out.println("Location inaccessable");
			}
		}else{
			System.out.println("Driver is unavailable");
		}
	}
}
