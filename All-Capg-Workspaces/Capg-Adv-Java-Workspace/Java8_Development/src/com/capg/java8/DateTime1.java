package com.capg.java8;

import java.time.*;
import java.time.format.*;
public class DateTime1 {
	public static void main(String[] args) {		
		String s="12:21:2023";
		DateTimeFormatter f=DateTimeFormatter.ofPattern("MM:dd:yyyy");
		LocalDate date=LocalDate.parse(s,f);
		System.out.println(date);
		s=date.format(f);
		System.out.println(s);
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getDayOfYear());
		System.out.println(date.getMonthValue());
		System.out.println(date.getYear());
	}
}
