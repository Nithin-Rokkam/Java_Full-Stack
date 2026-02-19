package com.capg.prac;

public class CountAlphaSB {
	public static void main(String[] args) {
        String s="aaabbcddd";
        StringBuilder sb=new StringBuilder();
        int count=1;
        for(int i=1;i<s.length();i++){
            char ch=s.charAt(i);
            char ch2=s.charAt(i-1);
            if(ch==ch2){
                count++;
            }else{
                sb.append(ch2).append(count);
                count=1;
            }
        }
        sb.append(s.substring(s.length()-1)).append(count);
        System.out.println(sb.toString());
    }
}
