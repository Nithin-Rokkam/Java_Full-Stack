package com.capg.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.springboot.entity.Booking;
import com.capg.springboot.service.BookingService;

@RestController
@RequestMapping("/bookings")
public class BookingController {
	@Autowired
	private BookingService bookingService;
	
	@PostMapping("/create")
	public Booking createBooking(@RequestBody Booking booking) {
		return bookingService.createBooking(booking);
	}
	
	@GetMapping("/all")
	public List<Booking> getAllBookings(){
		return bookingService.getAllBookings();
	}
	
	@GetMapping("/{bookingid}")
	public Booking getBookingById(@PathVariable int bookingid) {
		return bookingService.getBookingById(bookingid);
	}
	
	@PutMapping("/update/{bookingid}")
	public Booking updateBooking(@PathVariable int bookingid, @RequestBody Booking booking) {
		return bookingService.updateBooking(bookingid);
	}
	
	@DeleteMapping("/cancel/{bookingid}")
	public void cancelBooking(@PathVariable int bookingid) {
		bookingService.cancelBooking(bookingid);
	}
}
