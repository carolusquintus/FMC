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
public class Coupe extends AbstractCar {
	
	public Coupe(final Engine engine) {
		this(engine, Colour.UNPAINTED);
	}

	public Coupe(final Engine engine, final Colour colour) {
		super(engine, colour);
	}

}
