package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Booking;
import com.service.BookingService;

@RestController
public class BookingController {
	
	@Autowired
	private BookingService bookingService;
	
	@PostMapping("api/bookings")
	public Booking bookTicket(@RequestBody Booking booking)
	{
		return bookingService.bookTicket(booking);
	}
	
	@GetMapping("/api/bookings")
	public List<Booking> viewBooking(){
		return bookingService.viewBooking();
	}

	@DeleteMapping("/api/bookings/{bookingid}")
	public String cancelTicket(@PathVariable int bookingid)
	{
		return bookingService.cancelTicket(bookingid);
	}
}
