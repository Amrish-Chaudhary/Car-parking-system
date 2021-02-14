package com.system.carparking.entity;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "parkingslot")
public class ParkingSlot {

	@Id
	@Column(name = "slot_id", nullable = false)
	private Long slotId;
	
	@Column(name = "car_number")
	private String carNumber;
	
	@Column(name = "car_name")
	private String carName;
	
	@Column(name = "car_owner_name")
	private String carOwnerName;
	
	@Column(name = "entry_time")
	private LocalDateTime entryTime;
	
	@Column(name = "exit_time")
	private LocalDateTime exitTime;
	
	@Column(name = "fare")
	private Double fare;
	
	@Column(name = "comments")
	private String comments;

	public Long getSlotId() {
		return slotId;
	}

	public void setSlotId(Long slotId) {
		this.slotId = slotId;
	}

	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarOwnerName() {
		return carOwnerName;
	}

	public void setCarOwnerName(String carOwnerName) {
		this.carOwnerName = carOwnerName;
	}

	public LocalDateTime getEntryTime() {
		return entryTime;
	}

	public void setEntryTime(LocalDateTime entryTime) {
		this.entryTime = entryTime;
	}

	public LocalDateTime getExitTime() {
		return exitTime;
	}

	public void setExitTime(LocalDateTime exitTime) {
		this.exitTime = exitTime;
	}

	public Double getFare() {
		return fare;
	}

	public void setFare(Double fare) {
		this.fare = fare;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public ParkingSlot(Long slotId, String carNumber, String carName, String carOwnerName, LocalDateTime entryTime,
			LocalDateTime exitTime, double fare, String comments) {
		super();
		this.slotId = slotId;
		this.carNumber = carNumber;
		this.carName = carName;
		this.carOwnerName = carOwnerName;
		this.entryTime = entryTime;
		this.exitTime = exitTime;
		this.fare = fare;
		this.comments = comments;
	}

	public ParkingSlot() {
		super();
	}
	
	
}
