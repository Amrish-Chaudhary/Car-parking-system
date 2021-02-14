package com.system.carparking.helper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.system.carparking.dao.ParkingDataHistoryDao;
import com.system.carparking.dao.ParkingSlotDao;
import com.system.carparking.entity.ParkingDataHistory;
import com.system.carparking.entity.ParkingSlot;

@Component
public class ParkingHelper {

	public List<ParkingDataHistoryDao> getParkingDataHistoryDao(List<ParkingDataHistory> object) {
		List<ParkingDataHistoryDao> daoObjects = new ArrayList<>();
		object.forEach(obj -> {
			ParkingDataHistoryDao historyDao = getParkingHistoryDaoFromEntityObj(obj);
			daoObjects.add(historyDao);
		});
		return daoObjects;
	}

	public ParkingDataHistoryDao getParkingHistoryDaoFromEntityObj(ParkingDataHistory obj) {
		ParkingDataHistoryDao historyDao = new ParkingDataHistoryDao();
		if(obj.getId() != null)
			historyDao.setsNo(obj.getId());
		if(obj.getSlotId() != null)
			historyDao.setSlotId(obj.getSlotId());
		if(Objects.nonNull(obj.getCarNumber()))
			historyDao.setCarNumber(obj.getCarNumber());
		if(Objects.nonNull(obj.getCarName()))
			historyDao.setCarName(obj.getCarName());
		if(Objects.nonNull(obj.getCarOwnerName()))
			historyDao.setCarOwnerName(obj.getCarOwnerName());
		if(obj.getEntryTime() != null)
			historyDao.setEntryTime(obj.getEntryTime());
		if(obj.getExitTime() != null)
			historyDao.setExitTime(obj.getExitTime());
		if(obj.getFare() != 0)
			historyDao.setFare(obj.getFare());
		if(Objects.nonNull(obj.getComments()))
			historyDao.setComments(obj.getComments());
		return historyDao;
	}
	
	public ParkingSlot getParkingSlotfromDao(ParkingSlotDao parkingSlotDao) {
		ParkingSlot parkingSlot = new ParkingSlot(parkingSlotDao.getSlotId(), parkingSlotDao.getCarNumber(), parkingSlotDao.getCarName(), parkingSlotDao.getCarOwnerName(), parkingSlotDao.getEntryTime(),
				parkingSlotDao.getExitTime(), parkingSlotDao.getFare(), parkingSlotDao.getComments());
		return parkingSlot;
	}
	
	public List<ParkingSlot> getParkingSlotFromDao(List<ParkingSlotDao> object) {
		List<ParkingSlot> parkingSlots = new ArrayList<>();
		object.forEach(obj -> {
			ParkingSlot parkingSlot = new ParkingSlot(obj.getSlotId(), obj.getCarNumber(), obj.getCarName(), obj.getCarOwnerName(), obj.getEntryTime(),
					obj.getExitTime(), obj.getFare(), obj.getComments());
			parkingSlots.add(parkingSlot);
		});
		return parkingSlots;
	}
	
	public ParkingSlotDao getParkingSlotDaofromEntity(ParkingSlot parkingSlot) {
		ParkingSlotDao parkingSlotDao = new ParkingSlotDao();
		if(parkingSlot.getSlotId() != null)
			parkingSlotDao.setSlotId(parkingSlot.getSlotId());
		if(Objects.nonNull(parkingSlot.getCarNumber()))
			parkingSlotDao.setCarNumber(parkingSlot.getCarNumber());
		if(Objects.nonNull(parkingSlot.getCarName()))
			parkingSlotDao.setCarName(parkingSlot.getCarName());
		if(Objects.nonNull(parkingSlot.getCarOwnerName()))
			parkingSlotDao.setCarOwnerName(parkingSlot.getCarOwnerName());
		if(parkingSlot.getEntryTime() != null)
			parkingSlotDao.setEntryTime(parkingSlot.getEntryTime());
		if(parkingSlot.getExitTime() != null)
			parkingSlotDao.setExitTime(parkingSlot.getExitTime());
		if(parkingSlot.getFare() !=  null)
			parkingSlotDao.setFare(parkingSlot.getFare());
		if(Objects.nonNull(parkingSlot.getComments()))
			parkingSlotDao.setComments(parkingSlot.getComments());
		return parkingSlotDao;
	}
	
	public List<ParkingSlotDao> getParkingSlotDaoFromEntity(List<ParkingSlot> objects) {
		List<ParkingSlotDao> parkingSlotDaos = new ArrayList<>();
		objects.forEach(obj -> {
			ParkingSlotDao parkingSlotDao = getParkingSlotDaofromEntity(obj);
			parkingSlotDaos.add(parkingSlotDao);
		});
		return parkingSlotDaos;
	}

	public ParkingDataHistory getParkingHistoryFromParkingSlot(ParkingSlot obj) {
		ParkingDataHistory historyObj = new ParkingDataHistory();
		if(obj.getSlotId() != null)
			historyObj.setSlotId(obj.getSlotId());
		if(Objects.nonNull(obj.getCarNumber()))
			historyObj.setCarNumber(obj.getCarNumber());
		if(Objects.nonNull(obj.getCarName()))
			historyObj.setCarName(obj.getCarName());
		if(Objects.nonNull(obj.getCarOwnerName()))
			historyObj.setCarOwnerName(obj.getCarOwnerName());
		if(obj.getEntryTime() != null)
			historyObj.setEntryTime(obj.getEntryTime());
		if(obj.getExitTime() != null)
			historyObj.setExitTime(obj.getExitTime());
		if(obj.getFare() != 0)
			historyObj.setFare(obj.getFare());
		if(Objects.nonNull(obj.getComments()))
			historyObj.setComments(obj.getComments());
		return historyObj;
	}
	
	public ParkingSlot unParkVehicle(ParkingSlot parkingSlot) {
		ParkingSlot slot = new ParkingSlot();
		slot.setSlotId(parkingSlot.getSlotId());
		return slot;
	}
}
