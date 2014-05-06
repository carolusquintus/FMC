package com.fmc.vehicle.car.impl;

import com.fmc.engine.Engine;
import com.fmc.vehicle.car.AbstractCar;

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
public class Sport extends AbstractCar {
	
	public Sport(final Engine engine) {
		this(engine, Colour.UNPAINTED);
	}

	public Sport(final Engine engine, final Colour colour) {
		super(engine, colour);
	}

	@Override
	public double getPrice() {
		return 8000;
	}

}
