package com.fmc.serializer;

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
public enum SerialNumberGenerator {

	ENGINE, VEHICLE;

	private int count;

	public int getNextSerial() {
		return ++count;
	}

}
