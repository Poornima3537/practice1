package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.HotelDTO;
import com.example.demo.entity.Hotel;
import com.example.demo.service.HotelService;

@RestController
@RequestMapping("/hotels")
@CrossOrigin("*")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    // Add Hotel
    @PostMapping
    public Hotel addHotel(@RequestBody HotelDTO dto) {

        return hotelService.addHotel(dto);
    }

    // Get All Hotels
    @GetMapping
    public List<Hotel> getAllHotels() {

        return hotelService.getAllHotels();
    }

    // Get Hotel By Id
    @GetMapping("/{id}")
    public Hotel getHotelById(@PathVariable Long id) {

        return hotelService.getHotelById(id);
    }

    // Update Hotel
    @PutMapping("/{id}")
    public Hotel updateHotel(@PathVariable Long id,
                             @RequestBody HotelDTO dto) {

        return hotelService.updateHotel(id, dto);
    }

    // Delete Hotel
    @DeleteMapping("/{id}")
    public String deleteHotel(@PathVariable Long id) {

        return hotelService.deleteHotel(id);
    }
}