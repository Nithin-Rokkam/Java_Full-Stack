package com.capg.springboot.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.capg.springboot.entity.Book;

@Service
public class BookImpl {
	Book book1 = new Book(1, "Java Fundementals", "James Gosling");
	Book book2 = new Book(2, "Hibernate", "Gavin King");
	Book book3 = new Book(3, "Spring", "Rod Johnson");
	
	public List<Book> getAllBooks() {
		return Arrays.asList(book1, book2, book3);
	}
}
