package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.BookingDTO;
import com.example.demo.entity.Booking;
import com.example.demo.service.BookingService;

@RestController
@RequestMapping("/bookings")
@CrossOrigin("*")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    // Create Booking
    @PostMapping
    public Booking createBooking(@RequestBody BookingDTO dto) {

        return bookingService.createBooking(dto);
    }

    // Get All Bookings
    @GetMapping
    public List<Booking> getAllBookings() {

        return bookingService.getAllBookings();
    }

    // Delete Booking
    @DeleteMapping("/{id}")
    public String deleteBooking(@PathVariable Long id) {

        return bookingService.deleteBooking(id);
    }
}