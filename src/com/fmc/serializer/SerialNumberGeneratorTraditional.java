package com.fmc.serializer;

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
