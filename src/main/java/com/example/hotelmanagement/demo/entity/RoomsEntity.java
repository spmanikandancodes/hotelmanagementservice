package com.example.hotelmanagement.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "rooms")
public class RoomsEntity {

    @Id
    @Column(name = "ROOMID", nullable = false)
    private Long roomId;

    @Column(name = "CUSTOMERID", nullable = false)
    private Long customerId;

    @Column(name = "RENT", nullable = false)
    private BigDecimal rent;

    @Column(name = "ROOMSTATUS", nullable = false)
    private String roomStatus;

    @Column(name = "ROOMTYPE", nullable = false)
    private String roomType;
}
