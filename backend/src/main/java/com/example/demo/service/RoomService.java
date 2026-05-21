package com.example.demo.service;


import com.hotelbooking.entity.Room;
import com.hotelbooking.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {

    @Autowired
    private RoomRepository roomRepository;

    // Add Room
    public Room addRoom(Room room) {

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
    public Room updateRoom(Long id, Room updatedRoom) {

        Room room = getRoomById(id);

        room.setRoomType(updatedRoom.getRoomType());
        room.setPrice(updatedRoom.getPrice());
        room.setAvailable(updatedRoom.getAvailable());

        return roomRepository.save(room);
    }

    // Delete Room
    public String deleteRoom(Long id) {

        roomRepository.deleteById(id);

        return "Room Deleted Successfully";
    }
}