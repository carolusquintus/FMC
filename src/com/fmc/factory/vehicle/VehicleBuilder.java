package com.fmc.factory.vehicle;

import com.fmc.factory.component.AbstractComponentFactory;
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
public abstract class VehicleBuilder {
	
	protected AbstractComponentFactory factory;

	public void buildBody() {
	}

	public void buildBoot() {
	}

	public void buildChassis() {
	}

	public void buildPassengerArea() {
	}

	public void buildReinforcedStorageArea() {
	}

	public void buildWindows() {
	}

	public abstract Vehicle getVehicle();

}
