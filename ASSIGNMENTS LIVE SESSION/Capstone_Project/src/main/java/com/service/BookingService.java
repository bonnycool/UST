package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.entity.Booking;
import com.entity.Show;
import com.repository.BookingRepository;
import com.repository.ShowRepository;

@Service
public class BookingService {
	
	@Autowired
	private BookingRepository bookingRepository;
	
	@Autowired
	private ShowRepository showRepository;
	
	//bookin ticket logic
	public Booking bookTicket(Booking booking)
	{
		int showid=booking.getShow().getShowid();
		Optional <Show> optionalshow=showRepository.findById(showid);
		Show show;
		if(optionalshow.isPresent())
		{
			show=optionalshow.get();
		}
		else {
			throw new RuntimeException("Show not Found");
		}
	
		int availableseats=show.getAvailableseats();
		
		if(booking.getSeatsbooked()>availableseats)
		{
			throw new RuntimeException("Not Enough Seats");
			
		}
		else
		{
			show.setAvailableseats(availableseats-booking.getSeatsbooked());
		}
		
		return bookingRepository.save(booking);
	}
	
	public List<Booking> viewBooking(){
		return bookingRepository.findAll();
	}

	public  String cancelTicket( int bookingid)
	{
		Optional<Booking> booking1=bookingRepository.findById(bookingid);
		
		Booking booking=booking1.get();
		
		int availableseats=booking.getShow().getAvailableseats();
		
		Show show=booking.getShow();
		show.setAvailableseats(availableseats+booking.getSeatsbooked());
		
		 bookingRepository.delete(booking);
		 
		 return "Booking cancelled Successfully";
		
	}
	

}
