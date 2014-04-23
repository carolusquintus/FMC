package com.fmc.vehicle;

import com.fmc.engine.Engine;

public interface Vehicle extends Cloneable {

	public enum Colour {
		UNPAINTED, BLUE, BLACK, GREEN, RED, SILVER, WHITE, YELLOW
	}

	Engine getEngine();

	Colour getColour();

	void paint(Colour colour);

	Object clone();

}
