package com.capg.springboot.entity;

public class BookRating {
	private int bookId;
	private double rating;
	
	public BookRating() {
		
	}

	public BookRating(int bookId, double rating) {
		super();
		this.bookId = bookId;
		this.rating = rating;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}
}
