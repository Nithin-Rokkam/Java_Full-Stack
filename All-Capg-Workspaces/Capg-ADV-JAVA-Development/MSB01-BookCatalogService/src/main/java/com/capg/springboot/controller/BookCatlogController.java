package com.capg.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.springboot.entity.Book;
import com.capg.springboot.exception.ServiceException;
import com.capg.springboot.impl.BookImpl;

@RestController
@RequestMapping("/books")
public class BookCatlogController {
	@Autowired
	private BookImpl bookImpl;
	
	@GetMapping("/all")
	public ResponseEntity<List<Book>> getAllBooks() {
		List<Book> books = bookImpl.getAllBooks();
		if (books == null || books.isEmpty()) {
			throw new ServiceException("No books available in the catalog");
		}
		return new ResponseEntity<>(books, HttpStatus.OK);
	}
}
