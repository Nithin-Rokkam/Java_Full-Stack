package com.capg.springboot.impl;

import org.springframework.stereotype.Service;

@Service
public class BookRatingImpl {
	
	public double getBookRating(int bookId) {
		if (bookId == 1) {
			return 4.5;
		} else if (bookId == 2) {
			return 3.8;
		} else if (bookId == 3) {
			return 4.2;
		} else {
			return 0.0;
		}
	}
}
