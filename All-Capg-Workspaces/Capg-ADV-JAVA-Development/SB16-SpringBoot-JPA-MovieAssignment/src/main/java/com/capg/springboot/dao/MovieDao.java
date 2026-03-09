package com.capg.springboot.dao;

import com.capg.springboot.entities.Movie;
import java.util.List;

public interface MovieDao {
	Movie addMovie(Movie movie);
	Movie updateMovie(Movie movie);
	Movie deleteMovie(int movieId);
	List<Movie> getAllMovies();
	List<Movie> getMovieByRating(double movieRating);
}
