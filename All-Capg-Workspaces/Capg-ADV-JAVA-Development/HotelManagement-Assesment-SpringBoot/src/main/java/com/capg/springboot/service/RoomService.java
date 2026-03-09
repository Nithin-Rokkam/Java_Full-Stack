package com.capg.springboot.service;

import java.util.List;

import com.capg.springboot.entity.Room;

public interface RoomService {
	public Room createRoom(Room room);
	
	public List<Room> getAllRooms();
	
	public Room getRoomById(int roomId);
	
	public Room updateRoom(int roomId);
	
	public void deleteRoom(int roomId);
	
}
