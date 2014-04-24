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
public class SerialNumberGeneratorTraditional {

	private static SerialNumberGeneratorTraditional instance;
	private int count;

	private SerialNumberGeneratorTraditional() {
	}

	public synchronized static SerialNumberGeneratorTraditional getInstance() {

		if (instance == null) {
			instance = new SerialNumberGeneratorTraditional();
		}

		return instance;
	}

	public synchronized int getNextSerial() {
		return ++count;
	}

}
