package com.capg.prac;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Collections1 {

	public static void main(String[] args) {
	        ArrayList<Integer> list=new ArrayList<>();
//	        list.add(1);
//	        list.add(2);
//	        list.add(4);
//	        list.add(4);
//	        list.add(4);
//	        list.add(6);
//	        list.add(7);
//	        // list.remove(1);//removes the int at the perticular index.
//	        // list.remove(Integer.valueOf(3));// remove the value inside the valueOf()
//	        list.set(2,7);
//	        Collections.sort(list);
//	        System.out.println(Collections.frequency(list,4));
//	        for(Integer i:list){
//	            System.out.print(i+" ");
//	        }
//	        System.out.println();
//	        ArrayList<Integer> res=new ArrayList<>(new HashSet<>(list));
//	        Collections.reverse(res);
//	        for(Integer i:res){
//	            System.out.print(i+" ");
//	        }
	        
//	        ArrayList<Integer> list=new ArrayList<>();
//	        list.add(10);
//	        list.add(20);
//	        list.add(30);
//	        list.add(20);
//	        list.add(40);
//	        list.add(20);
//	        Iterator<Integer> it=list.iterator();
//	        while(it.hasNext()){
//	            int x=it.next();
//	            if(x==20){
//	                it.remove();
//	            }
//	        }
//	        for(Integer i:list){
//	            System.out.print(i+" ");
//	        }
//	        
//	        ArrayList<Integer> list=new ArrayList<>();
//	        list.add(11);
//	        list.add(21);
//	        list.add(30);
//	        list.add(23);
//	        list.add(40);
//	        list.add(20);
//	        Iterator<Integer> it=list.iterator();
//	        while(it.hasNext()){
//	            int x=it.next();
//	            if(x%2==0){
//	                it.remove();
//	            }
//	        }
//	        for(Integer i:list){
//	            System.out.print(i+" ");
//	        }
//	        
//	        
//	        ArrayList<Integer> list=new ArrayList<>();
//	        list.add(11);
//	        list.add(21);
//	        list.add(30);
//	        list.add(23);
//	        list.add(40);
//	        list.add(20);
//	        int max=Integer.MIN_VALUE;
//	        int smax=Integer.MIN_VALUE;
//	        for(Integer num:list){
//	            if(num>max){
//	                smax=max;
//	                max=num;
//	            }else if(num>smax && num!=max){
//	                smax=num;
//	            }
//	        }
//	        System.out.println(smax);
//	        
//	        
//	        ArrayList<Integer> list=new ArrayList<>();
//	        list.add(11);
//	        list.add(21);
//	        list.add(30);
//	        list.add(23);
//	        list.add(40);
//	        list.add(20);
//	        list.add(50);
//	        ArrayList<Integer> rotated=new ArrayList<>();
//	        for(int i=list.size()-1;i>=0;i--){
//	            int x=list.get(i);
//	            rotated.add(x);
//	        }
//	        for(Integer num:rotated){
//	            System.out.println(num+" ");
//	        }
	        
	        
	        ArrayList<String> list1=new ArrayList<>();
	        list1.add("Mango");
	        list1.add("Apple");
	        list1.add("Mango");
	        list1.add("Apple");
	        list1.add("Banana");
	        list1.add("Mango");
	        list1.add("Banana");
	        Map<String,Integer> map=new HashMap<>();
	        for(String word:list1) {
	        	if(map.containsKey(word)) {
	        		map.put(word,map.get(word)+1);
	        	}else {
	        		map.put(word, 1);
	        	}
	        }
	        
	        for(Map.Entry<String,Integer> entry:map.entrySet()) {
	        	System.out.println(entry.getKey()+":"+entry.getValue());
	        }
	        
	        
	}

}
