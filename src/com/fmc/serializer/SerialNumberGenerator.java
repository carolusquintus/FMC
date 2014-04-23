package com.fmc.serializer;

public enum SerialNumberGenerator {

	ENGINE, VEHICLE;

	private int count;

	public int getNextSerial() {
		return ++count;
	}

}
