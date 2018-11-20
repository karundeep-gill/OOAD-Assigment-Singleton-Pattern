package com.bits.Vehicle;

import java.util.List;

public class VehicleImpl implements Vehicle {

	private String vehicleNum;
	private String vehicleOwner;

	public VehicleImpl(String vehicleNum, String vehicleOwner) {
		super();
		this.vehicleNum = vehicleNum;
		this.vehicleOwner = vehicleOwner;

	}

	public String getVehicleNumber() {

		return this.vehicleNum;
	}

	public String getVehicleOwner() {

		return this.vehicleOwner;
	}

}
