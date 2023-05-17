package com.carRegistry.model;

public class Car {	
	private String plateNo;
	private String floor;
	private String vehicleType;
	private String avlSlot;
	private String bookedSlot;
	
	
	
	public Car() {
		
	}
	
	public Car(String plateNo, String floor, String vehicleType, String avlSlot, String bookedSlot) {
		super();
		this.plateNo = plateNo;
		this.floor = floor;
		this.vehicleType = vehicleType;
		this.avlSlot = avlSlot;
		this.bookedSlot = bookedSlot;
	}

	public String getPlateNo() {
		return plateNo;
	}
	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getAvlSlot() {
		return avlSlot;
	}

	public void setAvlSlot(String avlSlot) {
		this.avlSlot = avlSlot;
	}

	public String getBookedSlot() {
		return bookedSlot;
	}

	public void setBookedSlot(String bookedSlot) {
		this.bookedSlot = bookedSlot;
	}
	
	
	
	
}
