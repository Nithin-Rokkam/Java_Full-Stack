package com.capg.java8;

import java.util.Scanner;
public class Regex1 {
	public static void main(String[] args) {
		String regex="[A-Za-z]{4}[0-9]{5}";
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s=sc.next();
		if(s.matches(regex)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	}
}

