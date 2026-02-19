package com.capg.java8;

import java.util.Scanner;
public class EmailMatcherRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String regex="[a-z0-9]+@gmail.com";
		System.out.print("Enter the mail");
		String s=sc.next();
		if(s.matches(regex)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		sc.close();
	}

}

