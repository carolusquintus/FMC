package com.fmc.vehicle.van;

import com.fmc.engine.Engine;
import com.fmc.vehicle.AbstractVehicle;

public abstract class AbstractVan extends AbstractVehicle {
	
	public AbstractVan(final Engine engine) {
		this(engine, Colour.UNPAINTED);
	}

	public AbstractVan(final Engine engine, final Colour colour) {
		super(engine, colour);
	}

}
