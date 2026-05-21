package com.example.demo.controller;


import com.hotelbooking.entity.Room;
import com.hotelbooking.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rooms")
@CrossOrigin("*")
public class RoomController {

    @Autowired
    private RoomService roomService;

    // Add Room
    @PostMapping
    public Room addRoom(@RequestBody Room room) {

        return roomService.addRoom(room);
    }

    // Get All Rooms
    @GetMapping
    public List<Room> getAllRooms() {

        return roomService.getAllRooms();
    }

    // Get Room By Id
    @GetMapping("/{id}")
    public Room getRoomById(@PathVariable Long id) {

        return roomService.getRoomById(id);
    }

    // Update Room
    @PutMapping("/{id}")
    public Room updateRoom(@PathVariable Long id,
                           @RequestBody Room room) {

        return roomService.updateRoom(id, room);
    }

    // Delete Room
    @DeleteMapping("/{id}")
    public String deleteRoom(@PathVariable Long id) {

        return roomService.deleteRoom(id);
    }
}