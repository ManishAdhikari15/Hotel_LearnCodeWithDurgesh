package com.lcwd.Hotel.controller;

import com.lcwd.Hotel.model.Hotel;
import com.lcwd.Hotel.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HotelController {
    @Autowired
    private HotelService service;

    @PostMapping("/saveHotel")
    private Hotel saveHotel(@RequestBody Hotel hotel){
        return service.saveHotel(hotel);

    }

    @GetMapping("/findAllHotels")
    private List<Hotel> findAllHotels(){
        return service.listHotels();
    }

    @GetMapping("/findhotel/{id}")
    private Hotel findHotel(@PathVariable String id){
        return service.getHotel(id);
    }
}
