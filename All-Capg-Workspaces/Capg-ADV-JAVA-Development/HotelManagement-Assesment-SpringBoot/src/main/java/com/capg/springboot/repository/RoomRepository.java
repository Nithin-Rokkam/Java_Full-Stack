package com.capg.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.springboot.entity.Room;

public interface RoomRepository extends JpaRepository<Room, Integer> {
	
}