package com.capg.java8;

import java.util.Scanner;
public class ExceptionRegex {
	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		EntryUtility e=new EntryUtility();
		System.out.println("Enter the number of entries");
		int entries=sc.nextInt();
		sc.nextLine();
		int count=1;
		while(count<=entries) {
			 System.out.println("Enter entry "+count+" details");
			 String entry=sc.nextLine();
			 String arr[]=entry.split(":");
			 try {
				 for(int i=0;i<arr.length;i++) {
					 if(e.validateEmployeeid(arr[0]) && e.validateDuration(Integer.parseInt(arr[2]))) {
						 System.out.println("Valid entry details");
					 }
				 }
				 
			 }catch(InvalidEntryException e1) {
				 System.out.println(e1.getMessage());
			 }
			 count++;
		}
	}
}


class EntryUtility{
	public boolean validateEmployeeid(String employeeId) throws InvalidEntryException{
		String regex="GOAIR/[0-9]{4}";
		if(employeeId.matches(regex)) {
			return true;
		}else throw new InvalidEntryException("Invalid Entry Details");
	}
	
	public boolean validateDuration(int duration) throws InvalidEntryException {
		if(duration>0 && duration<=5) {
			return true;
		}else throw new InvalidEntryException("Invalid Entry Details");
	}
}

class InvalidEntryException extends Exception{
	public InvalidEntryException(String msg) {
		super(msg);
	}
}
