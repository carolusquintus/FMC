package com.fmc.factory.vehicle;

import com.fmc.vehicle.Vehicle;

/**
 *
 * Foo Motor Company
 *
 * Based on: "Java Design Pattern Essentials", Tony Bevis
 *
 * Date: Apr 23, 2014
 *
 * @author carolus
 *
 */
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
