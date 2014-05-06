package com.fmc.vehicle;

import com.fmc.engine.Engine;

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
public interface Vehicle extends Cloneable {

	public enum Colour {
		UNPAINTED, BLUE, BLACK, GREEN, RED, SILVER, WHITE, YELLOW
	}

	public Engine getEngine();

	public Colour getColour();

	public void paint(Colour colour);

	public Object clone();

	public double getPrice();

	public void cleanInterior();

	public void cleanExteriorBody();

	public void polishWindows();

	public void takeForTestDrive();

}
