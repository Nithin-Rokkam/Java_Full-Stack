package com.capg.prac;

import java.util.Scanner;
public class StringRev {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s=sc.nextLine();
        String temp[]=s.split(" ");
        String res="";
        for(String st:temp){
            res+=reverse(st)+" ";
        }
        System.out.print(res.trim());
        sc.close();
    }
    
    public static String reverse(String s){
        int len=s.length();
        String temp="";
        for(int i=len-1;i>=0;i--){
            temp+=s.charAt(i);
        }
        return temp;
    }
}
