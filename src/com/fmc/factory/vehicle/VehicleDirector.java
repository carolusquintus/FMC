package com.fmc.factory.vehicle;

import com.fmc.vehicle.Vehicle;

public abstract class VehicleDirector {

	public abstract Vehicle build(VehicleBuilder builder);

}
