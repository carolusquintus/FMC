package com.fmc.vehicle.car.impl;

import com.fmc.engine.Engine;
import com.fmc.vehicle.car.AbstractCar;

public class Sport extends AbstractCar {
	
	public Sport(final Engine engine) {
		this(engine, Colour.UNPAINTED);
	}

	public Sport(final Engine engine, final Colour colour) {
		super(engine, colour);
	}

}