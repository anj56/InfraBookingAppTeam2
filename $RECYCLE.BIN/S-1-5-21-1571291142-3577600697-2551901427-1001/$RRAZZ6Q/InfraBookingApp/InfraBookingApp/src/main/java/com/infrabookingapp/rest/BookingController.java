package com.infrabookingapp.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infrabookingapp.entity.Booking;
import com.infrabookingapp.service.BookingService;

@RestController
public class BookingController {
	
	@Autowired
	private BookingService bookingService;
	
	
	@PostMapping(value = "/addBooking")
	public Booking addbooking(@RequestBody Booking booking) {
		return this.bookingService.addBooking(booking);
	}
	
	@DeleteMapping("/booking/{id}")
	public boolean deleteBookingById(@PathVariable(name = "id")int id) {
		return this.bookingService.deleteBookingById(id);
	}
	
	@PutMapping("/booking/{id}")
	public Booking updateBookingById(@RequestBody Booking booking) {
		return this.bookingService.updateBookingById(booking);
	}

}
