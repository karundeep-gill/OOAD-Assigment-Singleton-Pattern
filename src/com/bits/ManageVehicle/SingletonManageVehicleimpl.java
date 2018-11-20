package com.bits.ManageVehicle;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.bits.Vehicle.Vehicle;
import com.bits.Vehicle.VehicleImpl;

public class SingletonManageVehicleimpl implements ManageVehicle {

	private int numberofCars;
	private int numberofBikes;
	private List<Vehicle> vehicles = new ArrayList<Vehicle>();

	private static ManageVehicle manageVehicle = new SingletonManageVehicleimpl();

	private SingletonManageVehicleimpl() {
	};

	public static ManageVehicle getInstance() {
		return manageVehicle;
	}

	public Vehicle getVehicleDetails(String vehicleNum) {
		for (Vehicle vehicle : vehicles) {
			if (vehicle.getVehicleNumber().equals(vehicleNum)) {
				return vehicle;
			}
		}

		return null;
	}

	public Boolean addVehicle(String vehicleNum, String carOwner) {

		Vehicle obj = new VehicleImpl(vehicleNum, carOwner);
		vehicles.add(obj);
		return true;
	}

	public Boolean deleteVehicle(String vehicleNum, String CarOwner) {
		for (Vehicle vehicle : vehicles) {
			if (vehicle.getVehicleNumber().equals(vehicleNum)) {
				vehicles.remove(vehicle);
			}
		}

		return null;
	}
}
