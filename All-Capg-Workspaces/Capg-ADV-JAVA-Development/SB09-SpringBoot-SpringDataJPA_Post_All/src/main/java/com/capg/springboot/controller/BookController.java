package com.capg.springboot.controller;

//import java.awt.print.Book;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.springboot.entity.Book;
import com.capg.springboot.service.BookService;

@RestController
public class BookController {
	@Autowired
	BookService bookService;
	
	@PostMapping("/addBook")
	public String addBook(@RequestBody Book book) {
		bookService.addBook(book);
		return "Book added successfully";
	}
	
	@GetMapping("/allBooks")
	public List<Book> getAllBook() {
		return bookService.getAllBook();
	}
	
	
}
