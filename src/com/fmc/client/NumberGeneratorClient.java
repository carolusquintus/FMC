package com.fmc.client;

import com.fmc.serializer.SerialNumberGenerator;
import com.fmc.serializer.SerialNumberGeneratorTraditional;

public class NumberGeneratorClient {

	public static void main(String[] args) {
		System.out.println("Using traditional singleton");
		
//		SerialNumberGeneratorTraditional generator = SerialNumberGeneratorTraditional.getInstance();
//		System.out.println(generator.hashCode());
//		System.out.println("Next serial: " + generator.getNextSerial());
//		generator = SerialNumberGeneratorTraditional.getInstance();
//		System.out.println(generator.hashCode());
//		System.out.println("Next serial: " + generator.getNextSerial());
//		generator = SerialNumberGeneratorTraditional.getInstance();
//		System.out.println(generator.hashCode());
//		System.out.println("Next serial: " + generator.getNextSerial());
		
		SerialNumberGenerator generator = SerialNumberGenerator.ENGINE;
		System.out.println(generator.hashCode());
		System.out.println("Next serial: " + generator.getNextSerial());
		generator = SerialNumberGenerator.VEHICLE;
		System.out.println(generator.hashCode());
		System.out.println("Next serial: " + generator.getNextSerial());
		generator = SerialNumberGenerator.ENGINE;
		System.out.println(generator.hashCode());
		System.out.println("Next serial: " + generator.getNextSerial());
		generator = SerialNumberGenerator.VEHICLE;
		System.out.println(generator.hashCode());
		System.out.println("Next serial: " + generator.getNextSerial());
		generator = SerialNumberGenerator.VEHICLE;
		System.out.println(generator.hashCode());
		System.out.println("Next serial: " + generator.getNextSerial());

	}

}
