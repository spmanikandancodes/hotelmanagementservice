package com.example.hotelmanagement.demo.repository;

import com.example.hotelmanagement.demo.entity.RoomsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRepository extends JpaRepository<RoomsEntity, Long> {


     List<RoomsEntity> findByroomStatus(String roomStatus);

}
