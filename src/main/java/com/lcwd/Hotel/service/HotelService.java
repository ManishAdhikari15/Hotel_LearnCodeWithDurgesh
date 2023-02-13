package com.lcwd.Hotel.service;

import com.lcwd.Hotel.model.Hotel;

import java.util.List;
import java.util.Optional;

public interface HotelService {

    public Hotel saveHotel(Hotel hotel);

    public List<Hotel> listHotels();

    public Hotel getHotel(String name);

}
