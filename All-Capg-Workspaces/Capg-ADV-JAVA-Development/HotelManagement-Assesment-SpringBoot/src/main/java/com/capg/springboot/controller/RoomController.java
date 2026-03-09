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

import com.capg.springboot.entity.Room;
import com.capg.springboot.service.RoomService;

@RestController
@RequestMapping("/rooms")
public class RoomController {
	@Autowired
	private RoomService roomService;
	
	@PostMapping("/add")
	public Room createRoom(@RequestBody Room room) {
		return roomService.createRoom(room);
	}
	
	@GetMapping("/all")
	public List<Room> getAllRooms(){
		return roomService.getAllRooms();
	}
	
	@GetMapping("/{roomId}")
	public Room getRoomById(@PathVariable int roomId) {
		return roomService.getRoomById(roomId);
	}
	
	@PutMapping("/update/{roomId}")
	public Room updateRoom(@PathVariable int roomId) {
		return roomService.updateRoom(roomId);
	}
	
	@DeleteMapping("/delete/{roomId}")
	public void deleteRoom(@PathVariable int roomId) {
		roomService.deleteRoom(roomId);
	}
}
