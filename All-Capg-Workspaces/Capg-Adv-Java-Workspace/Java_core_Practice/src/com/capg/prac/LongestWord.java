package com.capg.prac;

public class LongestWord {
	public static void main(String[] args) {
		String s = "Java programming is very powerful";
		int max=Integer.MIN_VALUE;
		String res="";
		String arr[]=s.split(" ");
		for(String st:arr){
			if(st.length()>max){
				max=st.length(); res=st; 
				} 
			} 
		System.out.println(res); 
		}
}
