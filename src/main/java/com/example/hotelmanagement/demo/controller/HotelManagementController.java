package com.example.hotelmanagement.demo.controller;

import com.example.hotelmanagement.demo.entity.RoomsEntity;
import com.example.hotelmanagement.demo.repository.RoomRepository;
import com.example.hotelmanagement.demo.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/hotel")
public class HotelManagementController {


    @Autowired
    RoomService roomService;

    @Autowired
    RoomRepository roomRepository;

    @GetMapping("/{id}")
    public ResponseEntity<RoomsEntity> getHotelById(@PathVariable("id") Long id) {

        RoomsEntity roomresponse = roomService.getRoomsById(id);

        return new  ResponseEntity<>(roomresponse, HttpStatus.OK);
    }

    @GetMapping("/listings")
    public List<RoomsEntity> getAllooms() {

        return roomRepository.findAll();
    }

}
