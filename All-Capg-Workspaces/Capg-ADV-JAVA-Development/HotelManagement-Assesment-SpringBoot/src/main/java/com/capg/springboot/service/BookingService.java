package com.capg.springboot.service;

import java.util.List;

import com.capg.springboot.entity.Booking;

public interface BookingService {
	public Booking createBooking(Booking booking);
	
	public List<Booking> getAllBookings();
	
	public Booking getBookingById(int bookingid);
	
	public Booking updateBooking(int bookingid,Booking booking);
	
	public void cancelBooking(int bookingid);
}
