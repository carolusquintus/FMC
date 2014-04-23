package com.fmc.vehicle.car;

import com.fmc.engine.Engine;
import com.fmc.vehicle.AbstractVehicle;

public abstract class AbstractCar extends AbstractVehicle {
	
	public AbstractCar(final Engine engine) {
		this(engine, Colour.UNPAINTED);
	}

	public AbstractCar(final Engine engine, final Colour colour) {
		super(engine, colour);
	}

}
