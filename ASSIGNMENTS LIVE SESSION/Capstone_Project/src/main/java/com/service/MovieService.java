package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Movie;
import com.repository.MovieRepository;
import java.util.*;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepository  movieRepository;
	
	public Movie addNewMovie(Movie movie)
	{
		return movieRepository.save(movie);
	}
	
	public List<Movie> viewAllMovies()
	{
		return movieRepository.findAll();
	}
	
	
	

}
