package com.lcwd.Hotel.service;

import com.lcwd.Hotel.exceptions.ResourceNotFoundException;
import com.lcwd.Hotel.model.Hotel;
import com.lcwd.Hotel.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService{

    @Autowired
    private HotelRepository repo;

    @Override
    public Hotel saveHotel(Hotel hotel) {
        String s=UUID.randomUUID().toString();
        hotel.setId(s);
        return repo.save(hotel);
    }

    @Override
    public List<Hotel> listHotels() {
        return repo.findAll();
    }

    @Override
    public Hotel getHotel(String id) {
        return repo.findById(id).orElseThrow(()->new ResourceNotFoundException());
    }
}
