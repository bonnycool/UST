package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Show;
import com.repository.ShowRepository;
import java.util.*;
@Service
public class ShowService {
	
	@Autowired
	private ShowRepository showRepository;
	
	public Show scheduleShow(Show show)
	{
		return showRepository.save(show);
	}
	
	public List<Show> viewShows()
	{
		return showRepository.findAll();
		
	}
	
	public List<Show> specificMovie(int movieid)
	{
		return showRepository.findByMovieMovieid(movieid);
	}

}
