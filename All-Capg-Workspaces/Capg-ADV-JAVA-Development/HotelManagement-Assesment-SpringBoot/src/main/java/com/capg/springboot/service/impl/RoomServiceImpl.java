package com.capg.springboot.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capg.springboot.entity.Room;
import com.capg.springboot.service.RoomService;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class RoomServiceImpl implements RoomService {
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Room createRoom(Room room) {
		return entityManager.merge(room);
	}
	
	@Override
	public List<Room> getAllRooms() {
		Query query=entityManager.createQuery("SELECT r FROM Room r", Room.class);
		@SuppressWarnings("unchecked")
		List<Room> rooms=query.getResultList();
		return rooms;
	}
	
	@Override
	public Room getRoomById(int roomId) {
		return entityManager.find(Room.class, roomId);
	}
	
	@Override
	public Room updateRoom(int roomId) {
		Room existingRoom=entityManager.find(Room.class, roomId);
		if(existingRoom!=null) {
			existingRoom.setRoomNumber(existingRoom.getRoomNumber());
			existingRoom.setRoomType(existingRoom.getRoomType());
			existingRoom.setPrice(existingRoom.getPrice());
			existingRoom.setStatus(existingRoom.getStatus());
			return existingRoom;
		}else {
			return null;
		}
	}
	
	@Override
	public void deleteRoom(int roomId) {
		Room room=entityManager.find(Room.class, roomId);
		if(room!=null) {
			entityManager.remove(room);
		}
	}
	
}
