package com.infrabookingapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infrabookingapp.dao.BookingDAO;
import com.infrabookingapp.entity.Booking;

@Service
public class BookingService {

	@Autowired
	private BookingDAO bookingDAO;

	public List<Booking> getAllBookings() {
		return this.bookingDAO.findAll();
	}
	
	public Booking getBookingById(int id) {
		Optional<Booking> optional=this.bookingDAO.findById(id);
		if(optional.isPresent())
			return optional.get();
		else
			return null;
	}
	
	public Booking addBooking(Booking booking) {
		return this.bookingDAO.save(booking);
	}
	
	public boolean deleteBookingById(int id) {
		boolean result = false;
		try {
			this.bookingDAO.deleteById(id);
			result = true;
		} catch (Exception e) {
			e.printStackTrace();
			result = false;
		}
		return result;
	}
	
	public Booking updateBookingById(Booking booking) {
		return this.bookingDAO.save(booking);
		
		}
	
}
