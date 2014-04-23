package com.fmc.vehicle.car.impl;

import com.fmc.engine.Engine;
import com.fmc.vehicle.car.AbstractCar;

public class Saloon extends AbstractCar {
	
	public Saloon(final Engine engine) {
		this(engine, Colour.UNPAINTED);
	}

	public Saloon(final Engine engine, final Colour colour) {
		super(engine, colour);
	}

}
