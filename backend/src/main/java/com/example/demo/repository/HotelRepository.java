package com.example.demo.repository;


import com.example.demo.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HotelRepository extends JpaRepository<Hotel, Long> {

    List<Hotel> findByLocation(String location);

    List<Hotel> findByPriceLessThanEqual(Double price);

    List<Hotel> findByHotelNameContainingIgnoreCase(String hotelName);
}
