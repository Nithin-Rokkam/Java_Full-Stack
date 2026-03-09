package com.capg.springboot.service;

import java.util.List;

import com.capg.springboot.entities.Movie;

public interface MovieService {
	Movie addMovie(Movie movie);
	Movie updateMovie(Movie movie);
	Movie deleteMovie(int movieId);
	List<Movie> getAllMovies();
	List<Movie> getMovieByRating(double movieRating);
}
