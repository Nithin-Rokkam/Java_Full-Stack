package com.capg.prac;

import java.util.Scanner;
public class StFirstCharLast {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
        String s=sc.nextLine();
        s=s.toLowerCase();
        String arr[] = s.split(" ");
        String res="";
        for(String st:arr){
            char ch=st.charAt(0);
            res+=st.substring(1,st.length())+ch;
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                res+="ay" + " ";
            }else res+="ed" + " ";
        }
        System.out.println("Result: "+res.trim());
        sc.close();
    }
}
