package com.example.hotelmanagement.demo.service;

import com.example.hotelmanagement.demo.entity.RoomsEntity;

import java.util.List;
import java.util.Optional;

public interface RoomService {

    RoomsEntity getRoomsById(Long Id);

    List<RoomsEntity> findByroomStatus(String roomStatus);



}
