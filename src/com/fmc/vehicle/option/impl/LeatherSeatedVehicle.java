package com.fmc.vehicle.option.impl;

import com.fmc.vehicle.Vehicle;
import com.fmc.vehicle.option.AbstractVehicleOption;

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
public class LeatherSeatedVehicle extends AbstractVehicleOption {
	
	public LeatherSeatedVehicle(final Vehicle vehicle) {
		super(vehicle);
	}

	@Override
	public double getPrice() {
		return vehicle.getPrice() + 1200;
	}

}
