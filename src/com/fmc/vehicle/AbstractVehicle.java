package com.fmc.vehicle;

import com.fmc.engine.Engine;

public abstract class AbstractVehicle implements Vehicle {

	private Engine engine;
	private Colour colour;

	public AbstractVehicle(final Engine engine) {
		this(engine, Colour.UNPAINTED);
	}

	public AbstractVehicle(final Engine engine, final Colour colour) {
		this.engine = engine;
		this.colour = colour;
	}

	@Override
	public Engine getEngine() {
		return this.engine;
	}

	@Override
	public Colour getColour() {
		return this.colour;
	}

	@Override
	public void paint(Colour colour) {
		this.colour = colour;
	}
	
	@Override
	public Object clone() {
		Object obj = null;

		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;
	}

	@Override
	public String toString() {
		return new StringBuilder().append(getClass().getSimpleName())
				.append(" (").append(engine).append(", ").append(colour)
				.append(")").toString();
	}
}