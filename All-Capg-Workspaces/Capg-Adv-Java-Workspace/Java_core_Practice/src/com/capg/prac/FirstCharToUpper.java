package com.capg.prac;

public class FirstCharToUpper {
	public static void main(String[] args) 
	{ String s = "java is coding language"; 
	String res=""; 
	String arr[]=s.split(" "); 
	for(String st:arr){ 
		char ch=st.charAt(0); 
		res+=Character.toUpperCase(ch); 
		res+=st.substring(1);
		res+=" "; 
		} 
	System.out.println(res.trim()); 
	}
}
