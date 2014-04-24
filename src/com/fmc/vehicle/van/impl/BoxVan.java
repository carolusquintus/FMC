package com.fmc.vehicle.van.impl;

import com.fmc.engine.Engine;
import com.fmc.vehicle.van.AbstractVan;

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
public class BoxVan extends AbstractVan {
	
	public BoxVan(final Engine engine) {
		this(engine, Colour.UNPAINTED);
	}

	public BoxVan(final Engine engine, final Colour colour) {
		super(engine, colour);
	}

}
