package com.capg.springboot.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Booking")
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookingId;
	private String customerName;
	private String customerPhone;
	private Date checkInDate;
	private Date checkOutDate;
	
	@ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

    public Booking() {}
	
	public int getBookingId() {
		return bookingId;
	}
	
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getCustomerPhone() {
		return customerPhone;
	}
	
	
	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}
	
	public Date getCheckInDate() {
		return checkInDate;
	}
	
	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}
	
	public Date getCheckOutDate() {
		return checkOutDate;
	}
	
	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	
	public Room getRoom() {
		return room;
	}
	
	public void setRoom(Room room) {
		this.room = room;
	}
}
