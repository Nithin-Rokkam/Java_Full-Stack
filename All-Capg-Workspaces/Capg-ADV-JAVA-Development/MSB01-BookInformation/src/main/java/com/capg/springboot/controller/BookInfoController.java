package com.capg.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.capg.springboot.entity.Book;
import com.capg.springboot.entity.Ratings;
import com.capg.springboot.exception.BookNotFoundException;
import com.capg.springboot.exception.ServiceException;

@RestController
@RequestMapping("/bookinfo")
public class BookInfoController {
	@Autowired
	RestTemplate rest;
	
	@GetMapping("/list/{bookid}")
	public ResponseEntity<Book> getAllData(@PathVariable("bookid") int id) {
		// Fetch book data from BookCatalogService
		Book[] books = rest.getForObject("http://localhost:9091/books/all", Book[].class);
		Book bookData = null;
		
		if (books == null || books.length == 0) {
			throw new ServiceException("No books available from catalog service");
		}
		
		// Finding the book with matching ID
		for (Book book : books) {
			if (book.getBookId() == id) {
				bookData = book;
				break;
			}
		}
		
		// If no matching book found
		if (bookData == null) {
			throw new BookNotFoundException("Book with ID " + id + " not found");
		}
		
		// Fetch rating data from BookRatingService
		Ratings rating = rest.getForObject("http://localhost:9093/ratings/" + id, Ratings.class);
		
		if (rating == null) {
			throw new ServiceException("Unable to fetch rating for book ID " + id);
		}
		
		Book result = new Book(bookData.getBookId(), bookData.getBookName(), String.valueOf(rating.getRating()));
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
}
