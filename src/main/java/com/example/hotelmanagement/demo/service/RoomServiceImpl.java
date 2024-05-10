package com.example.hotelmanagement.demo.service;

import com.example.hotelmanagement.demo.entity.RoomsEntity;
import com.example.hotelmanagement.demo.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoomServiceImpl implements  RoomService{

    @Autowired
    RoomRepository roomRepository;
    @Override
    public RoomsEntity getRoomsById(Long Id) {
        Optional <RoomsEntity> singleroom = roomRepository.findById(Id);
        return singleroom.get();
    }

    @Override
    public List<RoomsEntity> findByroomStatus(String roomStatus) {
        List <RoomsEntity> roomlist = roomRepository.findByroomStatus("available");
        return roomlist;
    }


}
