package com.capg.prac;

import java.util.Scanner;
public class String1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string:");
        String s=sc.nextLine();
        // for(char ch:s.toCharArray()){
        //     System.out.print(ch+" ");
        // }
        int vowels=0;
        int digits=0;
        int consonents=0;
        int special_char=0;
        for(int i=0;i<s.length();i++){
            char ch=s.toLowerCase().charAt(i);
            if(ch>='a' && ch<='z'){
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    vowels++;
                }
                else{
                    consonents++;
                }
            }
            else if(ch>='0' && ch<='9'){
                digits++;
            }
            else if(ch!=' '){
                special_char++;
            }
        }
        System.out.println("Vowels:"+vowels);
        System.out.println("digits:"+digits);
        System.out.println("Consonents:"+consonents);
        System.out.println("special_char:"+special_char);
    }
}