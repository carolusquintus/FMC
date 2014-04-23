package com.fmc.vehicle.van.impl;

import com.fmc.engine.Engine;
import com.fmc.vehicle.van.AbstractVan;

public class Pickup extends AbstractVan {
	
	public Pickup(final Engine engine) {
		this(engine, Colour.UNPAINTED);
	}

	public Pickup(final Engine engine, final Colour colour) {
		super(engine, colour);
	}

}
