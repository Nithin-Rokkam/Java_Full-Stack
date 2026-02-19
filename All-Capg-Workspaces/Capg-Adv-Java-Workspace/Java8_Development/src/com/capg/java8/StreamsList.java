package com.capg.java8;

import java.util.List;
import java.util.Arrays;

public class StreamsList {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(2,4,7,5,6,3,6,5);
        list.stream().
            sorted().
                distinct().filter(n->n%2==0)
                .map(n->n*2).forEach(n->System.out.println(n));
	}
}
