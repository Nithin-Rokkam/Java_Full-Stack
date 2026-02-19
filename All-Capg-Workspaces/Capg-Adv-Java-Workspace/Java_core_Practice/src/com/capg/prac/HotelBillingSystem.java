package com.capg.prac;

import java.util.Scanner;
public class HotelBillingSystem {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HotelRoom room=new HotelRoom();
		System.out.println("Enter Deluxe Room Details: ");
		System.out.print("Guest Name: ");
		String guestName=sc.next();
		room.setGuestName(guestName);
		System.out.print("Rate per Night: ");
		double ratePerNight=sc.nextDouble();
		room.setRatePerNight(ratePerNight);
		System.out.print("Nights Stayed: ");
		int nightsStayed=sc.nextInt();
		System.out.print("Joining Year: ");
		int joiningYear=sc.nextInt();
		room.setRoomType("Deluxe");
		
		HotelRoom room2=new HotelRoom();
		System.out.println("Enter Suite Room Details: ");
		System.out.print("Guest Name: ");
		String guestName2=sc.next();
		room2.setGuestName(guestName2);
		System.out.print("Rate per Night: ");
		double ratePerNight2=sc.nextDouble();
		room2.setRatePerNight(ratePerNight2);
		System.out.print("Nights Stayed: ");
		int nightsStayed2=sc.nextInt();
		System.out.print("Joining Year: ");
		int joiningYear2=sc.nextInt();
		room2.setRoomType("Suite");
		
		System.out.println("Room Summary:");
		System.out.println(room.getRoomType()+" Room: "+room.getGuestName()+", "+room.getRatePerNight()+" per night, Membership: "+room.calaucateMembershipYears(joiningYear));
		System.out.println(room2.getRoomType()+" Room: "+room2.getGuestName()+", "+room2.getRatePerNight()+" per night, Membership: "+room2.calaucateMembershipYears(joiningYear2));
		System.out.println("Total Bill: ");
		System.out.println("For "+room.getGuestName() +"("+room.getRoomType()+"): "+room.calculateTotalBilling(nightsStayed, joiningYear));
		System.out.println("For "+room2.getGuestName() +"("+room2.getRoomType()+"): "+room2.calculateTotalBilling(nightsStayed2, joiningYear2));
		sc.close();
	}
}


interface Room{
	public double calculateTotalBilling(int nightStayed,int joiningYear);
	public default int calaucateMembershipYears(int joiningYear) {
		return 2025-joiningYear;
	}
}

class HotelRoom implements Room{
	String roomType;
	double ratePerNight;
	String guestName;
	
	public HotelRoom() {
		
	}
	
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public double getRatePerNight() {
		return ratePerNight;
	}
	public void setRatePerNight(double ratePerNight) {
		this.ratePerNight = ratePerNight;
	}
	public String getGuestName() {
		return guestName;
	}
	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}
	
	public double calculateTotalBilling(int nightStayed,int joiningYear) {
		double totalBill=nightStayed*ratePerNight;
		if(calaucateMembershipYears(joiningYear)>3) {			
			totalBill=totalBill*0.9;
		}
		return Math.round(totalBill);
	}
}
