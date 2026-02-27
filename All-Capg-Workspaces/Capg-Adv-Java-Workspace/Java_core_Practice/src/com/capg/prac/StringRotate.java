package com.capg.prac;

import java.util.*;

public class StringRotate {

    public static String processString(String str, int k) {

        StringBuilder temp = new StringBuilder();

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(ch == 'a') ch = 'e';
            else if(ch == 'e') ch = 'i';
            else if(ch == 'i') ch = 'o';
            else if(ch == 'o') ch = 'u';
            else if(ch == 'u') ch = 'a';
            else if(ch == 'A') ch = 'E';
            else if(ch == 'E') ch = 'I';
            else if(ch == 'I') ch = 'O';
            else if(ch == 'O') ch = 'U';
            else if(ch == 'U') ch = 'A';

            temp.append(ch);
        }

        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for(int i = 0; i < temp.length(); i++)
            set.add(temp.charAt(i));

        StringBuilder sb = new StringBuilder();
        for(char ch : set)
            sb.append(ch);

        int len = sb.length();
        k = k % len;

        return sb.substring(len - k) + sb.substring(0, len - k);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num:");
        int t = sc.nextInt();

        while(t-- > 0) {
        	System.out.println("Enter words:");
            String str = sc.next();
            int k = sc.nextInt();
            System.out.println(processString(str, k));
        }
    }
}