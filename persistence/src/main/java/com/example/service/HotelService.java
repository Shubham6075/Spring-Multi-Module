package com.example.service;

import com.example.entity.Hotel;

import java.util.List;

public interface HotelService {

    Hotel saveHotel(Hotel hotel);
    List<Hotel> getAllHotels();
    Hotel getHotelById(Long id);
    Hotel updateHotel(Long id, Hotel hotel);
    void deleteHotel(Long id);
}
