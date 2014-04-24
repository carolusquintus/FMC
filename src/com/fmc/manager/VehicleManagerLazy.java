package com.fmc.manager;

import com.fmc.engine.impl.StandardEngine;
import com.fmc.vehicle.Vehicle;
import com.fmc.vehicle.car.impl.Coupe;
import com.fmc.vehicle.car.impl.Saloon;
import com.fmc.vehicle.car.impl.Sport;

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
public class VehicleManagerLazy {

	public Vehicle saloon, coupe, sport, boxVan, pickup;

	public Vehicle createSaloon() {
		if (saloon == null) {
			saloon = new Saloon(new StandardEngine(1300));
		} else {
			saloon = (Vehicle) saloon.clone();
		}

		return saloon;
	}

	public Vehicle createSport() {
		if (sport == null) {
			sport = new Sport(new StandardEngine(1300));
		} else {
			sport = (Vehicle) sport.clone();
		}

		return sport;
	}

	public Vehicle createCoupe() {
		if (coupe == null) {
			coupe = new Coupe(new StandardEngine(1300));
		} else {
			coupe = (Vehicle) coupe.clone();
		}

		return coupe;
	}

	public Vehicle createBoxVan() {
		if (boxVan == null) {
			boxVan = new Saloon(new StandardEngine(1300));
		} else {
			boxVan = (Vehicle) boxVan.clone();
		}

		return boxVan;
	}

	public Vehicle createPickup() {
		if (pickup == null) {
			pickup = new Saloon(new StandardEngine(1300));
		} else {
			pickup = (Vehicle) pickup.clone();
		}

		return pickup;
	}

}
