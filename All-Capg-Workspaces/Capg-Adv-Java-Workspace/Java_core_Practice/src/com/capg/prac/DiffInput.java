package com.capg.prac;
import java.util.Arrays;
import java.util.Scanner;
public class DiffInput {
	 public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        System.out.print("Enter the no of st:");
	        int n=sc.nextInt();
	        int index=0;
	        while(n>0){
	            System.out.print("Enter the id:");
	            int id=sc.nextInt();
	            sc.nextLine();
	            System.out.print("Enter the name:");
	            String name=sc.nextLine();
	            System.out.print("Enter the age:");
	            int age=sc.nextInt();
	            System.out.print("Enter the gpa:");
	            double gpa=sc.nextDouble();
	            sc.nextLine();
	            System.out.print("Enter the subjects");
	            String[] subjects = sc.nextLine().split(",");
	            System.out.print("Enter the marks");
	            Integer marks[]=new Integer[subjects.length];
	            for(int i=0;i<subjects.length;i++){
	                marks[i]=sc.nextInt();
	            }
	            index++;
	            n--;
	            
	            System.out.println("id"+id);
	            System.out.println("name"+name);
	            System.out.println("age"+age);
	            System.out.println("gpa"+gpa);
	            System.out.println("subjects:"+Arrays.asList(subjects));
	            System.out.println("marks:"+Arrays.asList(marks));
	            
	        }
	    }
}
