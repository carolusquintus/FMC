package com.fmc.factory.vehicle;

import com.fmc.vehicle.Vehicle;

public class VanDirector extends VehicleDirector {

	@Override
	public Vehicle build(VehicleBuilder builder) {
		
		builder.buildBody();
		builder.buildChassis();
		builder.buildReinforcedStorageArea();
		builder.buildWindows();
		
		return builder.getVehicle();
	}

}
