package com.fmc.vehicle.car.impl;

import com.fmc.engine.Engine;
import com.fmc.vehicle.car.AbstractCar;

public class Coupe extends AbstractCar {
	
	public Coupe(final Engine engine) {
		this(engine, Colour.UNPAINTED);
	}

	public Coupe(final Engine engine, final Colour colour) {
		super(engine, colour);
	}

}
