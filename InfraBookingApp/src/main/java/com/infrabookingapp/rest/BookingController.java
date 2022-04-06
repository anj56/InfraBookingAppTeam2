package com.infrabookingapp.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<Booking> addBooking(@RequestBody Booking booking) {
		return new ResponseEntity<Booking>(this.bookingService.addBooking(booking),HttpStatus.CREATED);
	}
	@DeleteMapping("/booking/{id}")
	public ResponseEntity<Boolean> deleteBookingById(@PathVariable(name = "id")int id) {
		return new ResponseEntity<Boolean>(this.bookingService.deleteBookingById(id),HttpStatus.OK);
	}
	
	@PutMapping("/booking/{id}")
	public  ResponseEntity<Booking> updateBookingById(@RequestBody Booking booking) {
		return new ResponseEntity<Booking>(this.bookingService.updateBookingById(booking),HttpStatus.OK);
	}

}
