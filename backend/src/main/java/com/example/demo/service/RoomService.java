package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.RoomDTO;
import com.example.demo.entity.Room;
import com.example.demo.repository.RoomRepository;

@Service
public class RoomService {

    @Autowired
    private RoomRepository roomRepository;

    // Add Room
    public Room addRoom(RoomDTO dto) {

        Room room = new Room();

        room.setRoomType(dto.getRoomType());
        room.setPrice(dto.getPrice());
        room.setAvailable(dto.getAvailable());

        return roomRepository.save(room);
    }

    // Get All Rooms
    public List<Room> getAllRooms() {

        return roomRepository.findAll();
    }

    // Get Room By Id
    public Room getRoomById(Long id) {

        return roomRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Room not found"));
    }

    // Update Room
    public Room updateRoom(Long id, RoomDTO dto) {

        Room room = getRoomById(id);

        room.setRoomType(dto.getRoomType());
        room.setPrice(dto.getPrice());
        room.setAvailable(dto.getAvailable());

        return roomRepository.save(room);
    }

    // Delete Room
    public String deleteRoom(Long id) {

        roomRepository.deleteById(id);

        return "Room Deleted Successfully";
    }
}