package com.capg.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.springboot.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, Integer> {
	
}