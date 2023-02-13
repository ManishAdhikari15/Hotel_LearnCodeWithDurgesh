package com.lcwd.Hotel.repository;

import com.lcwd.Hotel.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface HotelRepository extends JpaRepository<Hotel,String> {

//    @Query("select h from Hotel h where h.name = ?1")
//    public Hotel findByName(String name){
//
//        return
//    }
}
