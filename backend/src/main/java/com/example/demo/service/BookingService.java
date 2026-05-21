package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.BookingDTO;
import com.example.demo.entity.Booking;
import com.example.demo.entity.Room;
import com.example.demo.repository.BookingRepository;
import com.example.demo.repository.RoomRepository;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private RoomRepository roomRepository;

    // Create Booking
    public Booking createBooking(BookingDTO dto) {

        Room room = roomRepository.findById(dto.getRoomId())
                .orElseThrow(() -> new RuntimeException("Room not found"));

        if(!room.getAvailable()) {

            throw new RuntimeException("Room not available");
        }

        Booking booking = new Booking();

        booking.setCustomerName(dto.getCustomerName());
        booking.setCheckInDate(dto.getCheckInDate());
        booking.setCheckOutDate(dto.getCheckOutDate());
        booking.setRoomsBooked(dto.getRoomsBooked());

        booking.setRoom(room);

        room.setAvailable(false);

        roomRepository.save(room);

        return bookingRepository.save(booking);
    }

    // Get All Bookings
    public List<Booking> getAllBookings() {

        return bookingRepository.findAll();
    }

    // Delete Booking
    public String deleteBooking(Long id) {

        bookingRepository.deleteById(id);

        return "Booking Cancelled Successfully";
    }
}