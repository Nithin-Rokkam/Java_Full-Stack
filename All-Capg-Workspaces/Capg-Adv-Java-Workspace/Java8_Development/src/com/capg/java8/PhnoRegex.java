package com.capg.java8;

import java.util.Scanner;
public class PhnoRegex {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the mobile no: ");
		String mobileNo=sc.next();
		String regex="\\+91[6-9]{1}[0-9]{9}";
		if(mobileNo.matches(regex)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		sc.close();
	}
	
}

//first 3 +91
//phno 1st 6-9
//next 9numbers 0-9