package com.capg.springboot.service;

//import java.awt.print.Book;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.springboot.entity.Book;
import com.capg.springboot.repository.BookRepository;

@Service
public class BookService {
	@Autowired
	BookRepository bookRepository;
	
	public void addBook(Book book) {
		bookRepository.save(book);
	}
	
	public List<Book> getAllBook() {
		List<Book> books=new ArrayList<Book>();
		bookRepository.findAll().forEach(b1->books.add(b1));
		return books;
	}
}
