package com.system.carparking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.system.carparking.entity.ParkingDataHistory;

public interface ParkingDataHistoryRepository extends JpaRepository<ParkingDataHistory, Long>{

}
