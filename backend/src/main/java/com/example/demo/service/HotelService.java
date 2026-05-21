package com.example.demo.service;


import com.hotelbooking.entity.Hotel;
import com.hotelbooking.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    // Add Hotel
    public Hotel addHotel(Hotel hotel) {

        return hotelRepository.save(hotel);
    }

    // Get All Hotels
    public List<Hotel> getAllHotels() {

        return hotelRepository.findAll();
    }

    // Get Hotel By Id
    public Hotel getHotelById(Long id) {

        return hotelRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Hotel not found"));
    }

    // Update Hotel
    public Hotel updateHotel(Long id, Hotel updatedHotel) {

        Hotel hotel = getHotelById(id);

        hotel.setHotelName(updatedHotel.getHotelName());
        hotel.setLocation(updatedHotel.getLocation());
        hotel.setAmenities(updatedHotel.getAmenities());
        hotel.setPrice(updatedHotel.getPrice());

        return hotelRepository.save(hotel);
    }

    // Delete Hotel
    public String deleteHotel(Long id) {

        hotelRepository.deleteById(id);

        return "Hotel Deleted Successfully";
    }
}