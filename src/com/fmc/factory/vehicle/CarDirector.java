package com.fmc.factory.vehicle;

import com.fmc.component.Body;
import com.fmc.vehicle.Vehicle;

public class CarDirector extends VehicleDirector {

	@Override
	public Vehicle build(VehicleBuilder builder) {
		
		builder.buildBody();
		builder.buildBoot();
		builder.buildChassis();
		builder.buildPassengerArea();
		builder.buildWindows();
		
		return builder.getVehicle();
	}

}
