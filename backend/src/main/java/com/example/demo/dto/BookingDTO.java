package com.example.demo.dto;


import java.time.LocalDate;

import lombok.Data;

@Data
public class BookingDTO {

    private String customerName;

    private LocalDate checkInDate;

    private LocalDate checkOutDate;

    private int roomsBooked;

    private Long roomId;
}