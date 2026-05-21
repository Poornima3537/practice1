package com.example.demo.repository;


import com.example.demo.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {

    List<Booking> findByCustomerName(String customerName);

    List<Booking> findByCheckInDate(LocalDate checkInDate);

    List<Booking> findByCheckOutDate(LocalDate checkOutDate);
}
