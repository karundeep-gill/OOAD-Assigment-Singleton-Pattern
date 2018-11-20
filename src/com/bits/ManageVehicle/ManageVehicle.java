package com.bits.ManageVehicle;

import com.bits.Vehicle.Vehicle;

public interface ManageVehicle {

	public Vehicle getVehicleDetails(String vehicleNum);
	public Boolean addVehicle(String vehicleNum, String CarOwner);
	public Boolean deleteVehicle (String vehicleNum, String CarOwner);
	
	
}
