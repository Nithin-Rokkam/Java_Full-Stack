package com.capg.prac;

public class StringCount {
	 public static void main(String[] args) {
	        String s="aaabbcddd";
	        
	        char arr[]=s.toCharArray();
	        int count=1;
	        String res="";
	        for(int i=1;i<arr.length;i++){
	            if(arr[i]==arr[i-1]){
	                count++;
	            }else{
	                res+=arr[i-1];
	                res+=count;
	                count=1;
	            }
	        }
	        res+=arr[arr.length-1]+""+count;
	        System.out.println(res);
	    }
}
