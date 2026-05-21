package com.example.demo.controller;


import com.hotelbooking.entity.Booking;
import com.hotelbooking.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/booking")
@CrossOrigin("*")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    // Create Booking
    @PostMapping
    public Booking createBooking(@RequestBody Booking booking) {

        return bookingService.createBooking(booking);
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