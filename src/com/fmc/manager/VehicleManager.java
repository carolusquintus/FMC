package com.fmc.manager;

import com.fmc.engine.impl.StandardEngine;
import com.fmc.vehicle.Vehicle;
import com.fmc.vehicle.car.impl.Coupe;
import com.fmc.vehicle.car.impl.Saloon;
import com.fmc.vehicle.car.impl.Sport;
import com.fmc.vehicle.van.impl.BoxVan;
import com.fmc.vehicle.van.impl.Pickup;

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
public class VehicleManager {

	private Vehicle saloon, coupe, sport, boxVan, pickup;

	public VehicleManager() {
		saloon = new Saloon(new StandardEngine(1300));
		coupe = new Coupe(new StandardEngine(1300));
		sport = new Sport(new StandardEngine(1300));
		boxVan = new BoxVan(new StandardEngine(1300));
		pickup = new Pickup(new StandardEngine(1300));
	}

	public Vehicle createSaloon() {
		return (Vehicle) saloon.clone();
	}

	public Vehicle createCoupe() {
		return (Vehicle) coupe.clone();
	}

	public Vehicle createSport() {
		return (Vehicle) sport.clone();
	}

	public Vehicle createBoxVan() {
		return (Vehicle) boxVan.clone();
	}

	public Vehicle createPickup() {
		return (Vehicle) pickup.clone();
	}

}
