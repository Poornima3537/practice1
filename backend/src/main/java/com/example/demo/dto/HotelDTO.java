package com.example.demo.dto;


import lombok.Data;

@Data
public class HotelDTO {

    private String hotelName;

    private String location;

    private Double price;

    private String amenities;
}
