package com.capg.prac;

public class SBPalindrome {
	public static void main(String[] args) {
        String s="madam";
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));
        }
        if(s.equals(sb.toString())){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}	
