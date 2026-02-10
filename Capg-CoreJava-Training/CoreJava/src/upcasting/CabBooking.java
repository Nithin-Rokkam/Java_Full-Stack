package upcasting;
import java.util.*;
public class CabBooking {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Username: ");
		String uname=sc.nextLine();
		System.out.print("Enter the Contact: ");
		long contact=sc.nextLong();
		sc.nextLine();
		System.out.print("Enter the pickup location: ");
		String pick=sc.nextLine();
		System.out.print("Enter the drop location: ");
		String drop=sc.nextLine();
		System.out.println("--------------------------------");
		Ola o1=new Mini(uname, contact, pick, drop, 14);
		
		Mini m1=null;
		
		if(o1 instanceof Ola) {
			m1=(Mini)o1;
		}
		
		m1.bookcab();
		m1.display();
//		m1.bookcab();
//		m1.display();
		
		System.out.println();
		
		m1.walletBal();
//		m1.cancelBooking();
//		m1.display();
		sc.close();
		
	}
}

class Ola{
	private String username;
	private long contact;
	static double userbal=1000.00;
	
	Ola(String username,long contact,double userbal){
		this.setUsername(username);
		this.contact=contact;
		Ola.userbal=userbal;
	}
	
	boolean login() {
		if(this.getUsername().equals("Nithin") && this.contact==123456789) {
			return true;
		}else {
			return false;
		}
	}

	String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}
}

class Mini extends Ola{
	String pickup;
	String drop;
	double pkm;
	double price;
	boolean bookingstatus;
	
	Mini(String username,long contact,String pickup,String drop,double pkm){
		super(username,contact,userbal);
		this.pickup=pickup;
		this.drop=drop;
		this.pkm=pkm;
		price=18.00;
	}
	
	
	void bookcab() {
	    if (login()) {
	        if (userbal > 0 && userbal >= (pkm * price)) {
	            userbal -= pkm * price;
	            bookingstatus = true;
	            System.out.println("Booking successful");
	        } else {
	            System.out.println("Insufficient balance");
	            bookingstatus = false;
	        }
	    } else {
	        System.out.println("Booking Unsuccessful");
	        bookingstatus = false;
	    }
	}

	
	void cancelBooking(){
		if(bookingstatus) {
			userbal+=pkm*price;
			bookingstatus=false;
			System.out.println("Canceled successfully");
		}else {
			System.out.println("Booking status not found");
		}
	}
	void display() {
		System.out.println("Username: "+getUsername());
		System.out.println("Contact: "+getContact());
		System.out.println("Pickup location: "+pickup);
		System.out.println("Drop location: "+drop);
		System.out.println("Price : "+(pkm * price));
		System.out.println("Booking status: "+bookingstatus);
	}
	void walletBal() {
		System.out.println("Avail Balance: "+userbal);
	}
}

class Prime extends Ola{
	String pickup;
	String drop;
	double pkm;
	double price;
	boolean bookingstatus;
	Prime(String username,long contact,String pickup,String drop,double pkm){
		super(username,contact,userbal);
		this.pickup=pickup;
		this.drop=drop;
		this.pkm=pkm;
		price=27.00;
	}
	void bookcab() {
	    if (login()) {
	        if (userbal > 0 && userbal >= (pkm * price)) {
	            userbal -= pkm * price;
	            bookingstatus = true;
	            System.out.println("Booking successful");
	        } else {
	            System.out.println("Insufficient balance");
	            bookingstatus = false;
	        }
	    } else {
	        System.out.println("Booking Unsuccessful");
	        bookingstatus = false;
	    }
	}

	void cancelBooking(){
		if(bookingstatus) {
			userbal+=pkm*price;
			bookingstatus=false;
			System.out.println("Canceled successfully");
		}else {
			System.out.println("Booking status not found");
		}
	}
	void display() {
		System.out.println("Username: "+getUsername());
		System.out.println("Contact: "+getContact());
		System.out.println("Pickup location: "+pickup);
		System.out.println("Drop location: "+drop);
		System.out.println("Price : "+(pkm * price));
		System.out.println("Booking status: "+bookingstatus);
	}
	void walletBal() {
		System.out.println("Avail Balance: "+userbal);
	}
	
}

class Luxury extends Ola{
	String pickup;
	String drop;
	double pkm;
	double price;
	boolean bookingstatus;
	Luxury(String username,long contact,String pickup,String drop,double pkm){
		super(username,contact,userbal);
		this.pickup=pickup;
		this.drop=drop;
		this.pkm=pkm;
		price=35.00;
	}
	
	void bookcab() {
	    if (login()) {
	        if (userbal > 0 && userbal >= (pkm * price)) {
	            userbal -= pkm * price;
	            bookingstatus = true;
	            System.out.println("Booking successful");
	        } else {
	            System.out.println("Insufficient balance");
	            bookingstatus = false;
	        }
	    } else {
	        System.out.println("Booking Unsuccessful");
	        bookingstatus = false;
	    }
	}

	void cancelBooking(){
		if(bookingstatus) {
			userbal+=pkm*price;
			bookingstatus=false;
			System.out.println("Canceled successfully");
		}else {
			System.out.println("Booking status not found");
		}
	}
	void display() {
		System.out.println("Username: "+getUsername());
		System.out.println("Contact: "+getContact());
		System.out.println("Pickup location: "+pickup);
		System.out.println("Drop location: "+drop);
		System.out.println("Price : "+(pkm * price));
		System.out.println("Booking status: "+bookingstatus);
	}
	void walletBal() {
		System.out.println("Avail Balance: "+userbal);
	}
}