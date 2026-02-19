package com.capg.prac;

//import java.util.Arrays;
public class StringMethodsAll {
	public static void main(String[] args) {
        String s="java";
        String s3="Java";
        String s2=new String("Java");
        System.out.println(s==s2);
        System.out.println(s.equalsIgnoreCase(s2));
        System.out.println(s==s3);
        System.out.println(s.equals(s3));
        
        System.out.println(s.compareTo(s2));
        System.out.println(s.compareToIgnoreCase(s2));
        String temp1="asdfghjkl";
        String temp2="asdkghldss";
        System.out.println(temp1.substring(3,4));
        System.out.println(temp1.substring(4));
        System.out.println(temp1.contains("ghj"));
        System.out.println(temp1.startsWith("asd"));
        System.out.println(temp1.endsWith("jkl"));
        System.out.println(temp2.indexOf("k")+1);
        System.out.println(temp2.lastIndexOf("l")+1);
        System.out.println(temp2.replace('s','p'));
        System.out.println(temp2.replaceAll("asd","sri" ));
        String temp3="Java is coding lang";
        String temparr[]=temp3.split(" ");
        String res1="";
        for(String st:temparr){
            res1+=st+" ";
        }
        System.out.println(res1.trim());
        System.out.println(temp3.substring(4,5).isEmpty());
        System.out.println(temp3.substring(4,5).isBlank());
        char[] ch = "Java".toCharArray();
        for(char c : ch){
            System.out.print(c+" ");
        }
        int x = 10;
        String s5 = String.valueOf(x);
        System.out.println(s5);
        System.out.println(s5.getClass().getSimpleName());

        
    }
}
