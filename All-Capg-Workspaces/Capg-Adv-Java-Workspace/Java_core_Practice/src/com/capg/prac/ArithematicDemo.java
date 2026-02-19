package com.capg.prac;

import java.util.Scanner;
public class ArithematicDemo {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int res=0;
        try{
            res=num1/num2;
            System.out.println(res);
        }catch(ArithmeticException e){
            System.out.println("Cannot divide by 0");
        }
        sc.close();
    }
}
