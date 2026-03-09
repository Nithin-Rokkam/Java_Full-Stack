package com.capg.springboot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Movie")
public class Movie {
	@Id
	private int movieId;
	private String movieName;
	private String movieGenre;
	private double movieRating;
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieGenre() {
		return movieGenre;
	}
	public void setMovieGenre(String movieGenre) {
		this.movieGenre = movieGenre;
	}
	public double getMovieRating() {
		return movieRating;
	}
	public void setMovieRating(double movieRating) {
		this.movieRating = movieRating;
	}
	
	
	public Movie() {
		super();
	}
	
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", movieGenre=" + movieGenre
				+ ", movieRating=" + movieRating + "]";
	}
	
}
