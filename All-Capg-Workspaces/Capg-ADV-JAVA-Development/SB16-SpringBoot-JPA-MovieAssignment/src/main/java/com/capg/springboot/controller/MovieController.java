package com.capg.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.springboot.entities.Movie;
import com.capg.springboot.service.MovieService;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @PostMapping("/addMovie")
    public ResponseEntity<Movie> addMovie(@RequestBody Movie movie) {
        Movie savedMovie = movieService.addMovie(movie);
        return ResponseEntity.ok(savedMovie);
    }

    @PutMapping("/updateMovie")
    public ResponseEntity<Movie> updateMovie(@RequestBody Movie movie) {
        Movie updatedMovie = movieService.updateMovie(movie);
        return ResponseEntity.ok(updatedMovie);
    }

    @DeleteMapping("/deleteMovie/{movieId}")
    public ResponseEntity<String> deleteMovie(@PathVariable int movieId) {
        movieService.deleteMovie(movieId);
        return ResponseEntity.ok("Movie deleted successfully");
    }

    @GetMapping("/getAllMovies")
    public ResponseEntity<List<Movie>> getAllMovies() {
        List<Movie> movies = movieService.getAllMovies();
        return ResponseEntity.ok(movies);
    }

    @GetMapping("/getMovieByRating/{movieRating}")
    public ResponseEntity<List<Movie>> getMovieByRating(@PathVariable double movieRating) {
        List<Movie> movies = movieService.getMovieByRating(movieRating);
        return ResponseEntity.ok(movies);
    }
}