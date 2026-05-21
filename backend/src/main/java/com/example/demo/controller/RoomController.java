package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.RoomDTO;
import com.example.demo.entity.Room;
import com.example.demo.service.RoomService;

@RestController
@RequestMapping("/rooms")
@CrossOrigin("*")
public class RoomController {

    @Autowired
    private RoomService roomService;

    // Add Room
    @PostMapping
    public Room addRoom(@RequestBody RoomDTO dto) {

        return roomService.addRoom(dto);
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
                           @RequestBody RoomDTO dto) {

        return roomService.updateRoom(id, dto);
    }

    // Delete Room
    @DeleteMapping("/{id}")
    public String deleteRoom(@PathVariable Long id) {

        return roomService.deleteRoom(id);
    }
}