package com.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;

@Entity
public class Booking {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int bookingid;
	
	private String customername;
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public int getSeatsbooked() {
		return seatsbooked;
	}
	public void setSeatsbooked(int seatsbooked) {
		this.seatsbooked = seatsbooked;
	}
	
	public Show getShow() {
		return show;
	}
	public void setShow(Show show) {
		this.show = show;
	}
	public int getBookingid() {
		return bookingid;
	}
	private int seatsbooked;
	private  LocalDate date;
	public LocalDate getDate() {
		return date;
	}
	
	@PrePersist
	public void generateBookingDate() {
		 this.date=LocalDate.now();
	}
	
	@ManyToOne
	@JoinColumn(name="show_id")
	private Show show;
	
	
	

}
