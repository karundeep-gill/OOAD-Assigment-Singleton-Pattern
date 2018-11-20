package com.bits.Main;

import com.bits.ManageVehicle.ManageVehicle;
import com.bits.ManageVehicle.SingletonManageVehicleimpl;
import com.bits.Vehicle.Vehicle;
import com.bits.Vehicle.VehicleImpl;

public class Test {

	public static void main(String... s) {
		
				
			ManageVehicle manageVehicle = SingletonManageVehicleimpl
					.getInstance();
			manageVehicle.addVehicle("UP 14 CU 4047", "Karundeep");
			manageVehicle.addVehicle("UP 14 CU 4048", "Raj Kiran");
			Vehicle vehDets=manageVehicle.getVehicleDetails("UP 14 CU 4048");
			System.out.println(vehDets.getVehicleOwner());
		}
	}

