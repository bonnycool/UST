package com.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "shows")
public class Show {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int showid;
	
	public int getShowid() {
		return showid;
	}
	private LocalDateTime showtime;
	public LocalDateTime getShowtime() {
		return showtime;
	}

	public void setShowtime(LocalDateTime showtime) {
		this.showtime = showtime;
	}

	public int getTotalseats() {
		return totalseats;
	}

	public void setTotalseats(int totalseats) {
		this.totalseats = totalseats;
	}

	public int getAvailableseats() {
		return availableseats;
	}

	public void setAvailableseats(int availableseats) {
		this.availableseats = availableseats;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	private int totalseats;
	private int availableseats;
	
	@ManyToOne
	@JoinColumn(name="movie_id")
	private Movie movie;
	

}
