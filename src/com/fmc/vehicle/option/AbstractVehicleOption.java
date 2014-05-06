package com.fmc.vehicle.option;

import com.fmc.vehicle.AbstractVehicle;
import com.fmc.vehicle.Vehicle;

/**
 *
 * Foo Motor Company
 *
 * Based on: "Java Design Pattern Essentials", Tony Bevis
 *
 * Date: May 5, 2014
 *
 * @author carolus
 *
 */
public abstract class AbstractVehicleOption extends AbstractVehicle {
	
	protected Vehicle vehicle;
	
	public AbstractVehicleOption(final Vehicle vehicle) {
		super(vehicle.getEngine());
		this.vehicle = vehicle;
	}

}
