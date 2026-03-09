package com.capg.springboot.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capg.springboot.entity.Booking;
import com.capg.springboot.exception.RoomNotVacantException;
import com.capg.springboot.service.BookingService;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class BookingServiceImpl implements BookingService {
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Booking createBooking(Booking booking) {
		validateRoomVacancy(booking, null);
		return entityManager.merge(booking);
	}
	
	@Override
	public List<Booking> getAllBookings() {
		Query query=entityManager.createQuery("SELECT b FROM Booking b", Booking.class);
		@SuppressWarnings("unchecked")
		List<Booking> bookings=query.getResultList();
		return bookings;
	}
	
	@Override
	public Booking getBookingById(int booking) {
		return entityManager.find(Booking.class, booking);
	}
	
	@Override
	public Booking updateBooking(int bookingid, Booking booking) {
		Booking existingBooking=entityManager.find(Booking.class, bookingid);
		if(existingBooking!=null) {
			validateRoomVacancy(existingBooking, bookingid);
			existingBooking.setCheckInDate(existingBooking.getCheckInDate());
			existingBooking.setCheckOutDate(existingBooking.getCheckOutDate());
			existingBooking.setRoom(existingBooking.getRoom());
			return existingBooking;
		}else {
			return null;
		}
	}
	
	@Override
	public void cancelBooking(int bookingid) {
		Booking booking=entityManager.find(Booking.class, bookingid);
		if(booking!=null) {
			entityManager.remove(booking);
		}
	}

	private void validateRoomVacancy(Booking booking, Integer excludeBookingId) {
		if (booking == null || booking.getRoom() == null || booking.getRoom().getRoomNumber() == null
				|| booking.getCheckInDate() == null || booking.getCheckOutDate() == null) {
			return;
		}

		String jpql = "SELECT COUNT(b) FROM Booking b "
				+ "WHERE b.room.roomNumber = :roomNumber "
				+ "AND b.checkInDate < :checkOutDate "
				+ "AND b.checkOutDate > :checkInDate";
		if (excludeBookingId != null) {
			jpql += " AND b.bookingId <> :bookingId";
		}

		Query query = entityManager.createQuery(jpql);
		query.setParameter("roomNumber", booking.getRoom().getRoomNumber());
		query.setParameter("checkInDate", booking.getCheckInDate());
		query.setParameter("checkOutDate", booking.getCheckOutDate());
		if (excludeBookingId != null) {
			query.setParameter("bookingId", excludeBookingId);
		}

		Long conflictCount = (Long) query.getSingleResult();
		if (conflictCount != null && conflictCount > 0) {
			throw new RoomNotVacantException("Room is not vacant");
		}
	}
}