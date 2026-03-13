package com.capg.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.springboot.entity.BookRating;
import com.capg.springboot.exception.BookNotFoundException;
import com.capg.springboot.impl.BookRatingImpl;

@RestController
@RequestMapping("/ratings")
public class BookRatingController {
	@Autowired
	private BookRatingImpl bookRatingService;
	
	@GetMapping("/{bookId}")
	public ResponseEntity<BookRating> getBookRating(@PathVariable int bookId) {
		double rating = bookRatingService.getBookRating(bookId);
		
		if (rating == 0.0) {
			throw new BookNotFoundException("Rating not found for book ID " + bookId);
		}
		
		BookRating bookRating = new BookRating(bookId, rating);
		return new ResponseEntity<>(bookRating, HttpStatus.OK);
	}
}
