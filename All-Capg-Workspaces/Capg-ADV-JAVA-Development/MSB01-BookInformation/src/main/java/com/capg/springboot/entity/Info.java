package com.capg.springboot.entity;

import java.util.List;

public class Info {
	private int bookId;
	private String bookName;
	private int bookRating;
	private String bookAuthor;
	private List<Info> bookList;
	
	public Info() {
		
	}
	
	public Info(int bookId, String bookName, int bookRating, String bookAuthor) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookRating = bookRating;
		this.bookAuthor = bookAuthor;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getBookRating() {
		return bookRating;
	}

	public void setBookRating(int bookRating) {
		this.bookRating = bookRating;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public List<Info> getBookList() {
		return bookList;
	}

	public void setBookList(List<Info> bookList) {
		this.bookList = bookList;
	}
	
	
}	
