package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Movie;
import com.service.MovieService;
import java.util.*;

@RestController
public class MovieController {

	@Autowired
	private MovieService movieService;
	
	@PostMapping("/api/movies")
	public Movie  addNewMovie(@RequestBody Movie movie)
	{
		return movieService.addNewMovie(movie);
		
	}
	
	@GetMapping("/api/movies")
	public List<Movie> viewAllMovies()
	{
		return movieService.viewAllMovies();
	}
}
