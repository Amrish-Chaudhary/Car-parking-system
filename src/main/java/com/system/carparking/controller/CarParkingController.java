package com.system.carparking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.system.carparking.dao.ParkingDataHistoryDao;
import com.system.carparking.dao.ParkingSlotDao;
import com.system.carparking.service.ParkingService;

@RestController
@RequestMapping("/carparking/slot/")
public class CarParkingController {
	
	@Autowired
	ParkingService parkingService;
	
	@GetMapping
	@ResponseBody List<ParkingSlotDao> getAvailableSlot() {
		return parkingService.checkAndGetAvailableParkingSlot();
	}
	
	@GetMapping("info/{slotId}")
	@ResponseBody ParkingSlotDao specificParkingSlotInfo(@PathVariable Long slotId) {
		return parkingService.checkSpecificParkingSlot(slotId);
	}
	
	@GetMapping("check/{slotId}")
	String specificParkingSlotAvailablityCheck(@PathVariable Long slotId) {
		boolean isAvailable = parkingService.checkSpecificParkingSlotIsAvailable(slotId);
		if(isAvailable) 
			return ("The Parking slot "+slotId+" is Available") ;
		else return( "The Parking slot "+slotId+" is not Available"); 
	}
	
	@PostMapping("parking")
	@ResponseBody ParkingSlotDao parkVehicle(@RequestBody ParkingSlotDao parkingSlotDao) {
		return parkingService.parkVehicle(parkingSlotDao);
		
	}
	
	@PutMapping("unparking")
	@ResponseBody ParkingSlotDao unParkVehicle(@RequestBody ParkingSlotDao parkingSlotDao) {
		return parkingService.unparkVehicle(parkingSlotDao);
		
	}
	
	@GetMapping("parking/history")
	@ResponseBody List<ParkingDataHistoryDao> getParkingSlotHistory() {
		return parkingService.getAllParkingHistory();
	}
	
	
}
