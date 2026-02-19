package com.capg.java8;

import java.util.Scanner;
public class RegexPassword {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String regex="[A-Z]{4}@10[\\d]|[A-Z]{4}@11[0-5]";
		System.out.println("Enter the username: ");
		String s=sc.nextLine();
		boolean flag=false;
		if(s.length()==8) {
			if(s.matches(regex)) {
				flag=true;
			}else {
				flag=false;
				System.out.println(s+" is an invalid username");
				return;
			}
		}
		String res="";
		if(flag) {
			res+="TECH_"+sum(s.substring(0,4))+s.substring(s.length()-2);
		}else {
			return;
		}
		System.out.println(res);
	}
	
	public static int sum(String s) {
		char arr[] = s.toCharArray();
		int res=0;
		for(int ch: arr) {
			res+=ch;
		}
		return res;
	}
}
