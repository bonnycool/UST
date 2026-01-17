package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Show;
import com.service.ShowService;

@RestController
public class ShowController {
	
	@Autowired
	private  ShowService showService;
	
	@PostMapping("/api/shows")
	public Show scheduleShow(@RequestBody Show show)
	{
		return showService.scheduleShow(show);
		
	}
	
	@GetMapping("/api/shows")
	public List<Show> viewShows()
	{
		return showService.viewShows();
	}
	
	@GetMapping("/api/shows/movie/{movieid}")
	public List<Show> specificMovie(@PathVariable  int movieid)
	{
		return showService.specificMovie(movieid);
	}

}
