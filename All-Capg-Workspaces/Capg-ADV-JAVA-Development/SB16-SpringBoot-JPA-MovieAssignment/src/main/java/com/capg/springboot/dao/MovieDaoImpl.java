package com.capg.springboot.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.capg.springboot.entities.Movie;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class MovieDaoImpl implements MovieDao {
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Movie addMovie(Movie movie) {
		return em.merge(movie);
	}
	
	@Override
	public Movie updateMovie(Movie movie) {
		Movie existingMovie=em.find(Movie.class,movie.getMovieId());
		if(existingMovie!=null) {
			existingMovie.setMovieName(movie.getMovieName());
			existingMovie.setMovieGenre(movie.getMovieGenre());
			existingMovie.setMovieRating(movie.getMovieRating());
			return existingMovie;
		}else {
			return null;
		}
	}
	
	@Override
	public Movie deleteMovie(int movieId) {
		Movie movie=em.find(Movie.class,movieId);
		if(movie!=null) {
			em.remove(movie);
			return movie;
		}else {
			return null;
		}
	}
	
	@Override
	public List<Movie> getAllMovies() {
		Query query=em.createQuery("SELECT m FROM Movie m");
		List<Movie> movies=query.getResultList();
		return movies;
	}
	
	@Override
	public List<Movie> getMovieByRating(double movieRating) {
		Query query=em.createQuery("SELECT m FROM Movie m WHERE m.movieRating>=:movieRating");
		query.setParameter("movieRating", movieRating);
		List<Movie> movies=query.getResultList();
		return movies;
	}
	
}
