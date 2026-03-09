package com.capg.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.springboot.dao.MovieDao;
import com.capg.springboot.entities.Movie;

@Service
public class MovieServiceImpl implements MovieService {
	@Autowired
	private MovieDao dao;
	
	public Movie addMovie(Movie movie) {
		return dao.addMovie(movie);
	}
	
	public Movie updateMovie(Movie movie) {
		return dao.updateMovie(movie);
	}
	
	public Movie deleteMovie(int movieId) {
		return dao.deleteMovie(movieId);
	}
	
	public List<Movie> getAllMovies() {
		return dao.getAllMovies();
	}
	
	public List<Movie> getMovieByRating(double movieRating) {
		return dao.getMovieByRating(movieRating);
	}
}
