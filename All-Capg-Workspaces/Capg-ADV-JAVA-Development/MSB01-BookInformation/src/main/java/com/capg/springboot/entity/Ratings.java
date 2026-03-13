package com.capg.springboot.entity;

public class Ratings {
	private int bookId;
	private double rating;
	
	public Ratings() {
		
	}

	public Ratings(int bookId, double rating) {
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
