package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.HotelDTO;
import com.example.demo.entity.Hotel;
import com.example.demo.repository.HotelRepository;

@Service
public class HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    // Add Hotel
    public Hotel addHotel(HotelDTO dto) {

        Hotel hotel = new Hotel();

        hotel.setHotelName(dto.getHotelName());
        hotel.setLocation(dto.getLocation());
        hotel.setPrice(dto.getPrice());
        hotel.setAmenities(dto.getAmenities());

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
    public Hotel updateHotel(Long id, HotelDTO dto) {

        Hotel hotel = getHotelById(id);

        hotel.setHotelName(dto.getHotelName());
        hotel.setLocation(dto.getLocation());
        hotel.setPrice(dto.getPrice());
        hotel.setAmenities(dto.getAmenities());

        return hotelRepository.save(hotel);
    }

    // Delete Hotel
    public String deleteHotel(Long id) {

        hotelRepository.deleteById(id);

        return "Hotel Deleted Successfully";
    }
}