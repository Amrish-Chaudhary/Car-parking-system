package com.system.carparking.dao;

import org.springframework.data.jpa.domain.Specification;

import com.system.carparking.entity.ParkingSlot;

public class ParkingSlotSpecification {

	public static Specification<ParkingSlot> availableParkingSlot() {
		return (parkingslot, cq, cb) -> cb.equal(parkingslot.get("carNumber"), "");
	}
}
