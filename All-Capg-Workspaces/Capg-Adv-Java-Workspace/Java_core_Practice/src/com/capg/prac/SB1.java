package com.capg.prac;

public class SB1 {
	public static void main(String[] args) {
        String s="Java is powerful";
        String res="";
        String arr[]=s.split(" ");
        for(int i=0;i<arr.length;i++){
            StringBuilder sb=new StringBuilder(arr[i]);
            res+=sb.reverse().toString()+" ";
        }
        System.out.println(res);
        
        
//        public static void main(String[] args) {
//            String s="Java is powerful";
//            StringBuilder sb=new StringBuilder();
//            // sb.reverse().toString();
//            for(int i=s.length()-1;i>=0;i--){
//                sb.append(s.charAt(i));
//            }
//            System.out.println(sb.toString());
//        }
    }
}
