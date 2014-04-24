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
public abstract class VehicleDirector {

	public abstract Vehicle build(VehicleBuilder builder);

}
