package com.fmc.client;

import org.apache.log4j.Logger;

import com.fmc.serializer.SerialNumberGenerator;

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
 * Client class to test Singleton Pattern
 *
 */
public class NumberGeneratorClient {
	
	private static final Logger log = Logger.getLogger(NumberGeneratorClient.class);

	public static void main(String[] args) {
		log.info("Using traditional singleton");
		
//		SerialNumberGeneratorTraditional generator = SerialNumberGeneratorTraditional.getInstance();
//		log.info(generator.hashCode());
//		log.info("Next serial: " + generator.getNextSerial());
//		generator = SerialNumberGeneratorTraditional.getInstance();
//		log.info(generator.hashCode());
//		log.info("Next serial: " + generator.getNextSerial());
//		generator = SerialNumberGeneratorTraditional.getInstance();
//		log.info(generator.hashCode());
//		log.info("Next serial: " + generator.getNextSerial());
		
		SerialNumberGenerator generator = SerialNumberGenerator.ENGINE;
		log.info(generator.hashCode());
		log.info("Next serial: " + generator.getNextSerial());
		generator = SerialNumberGenerator.VEHICLE;
		log.info(generator.hashCode());
		log.info("Next serial: " + generator.getNextSerial());
		generator = SerialNumberGenerator.ENGINE;
		log.info(generator.hashCode());
		log.info("Next serial: " + generator.getNextSerial());
		generator = SerialNumberGenerator.VEHICLE;
		log.info(generator.hashCode());
		log.info("Next serial: " + generator.getNextSerial());
		generator = SerialNumberGenerator.VEHICLE;
		log.info(generator.hashCode());
		log.info("Next serial: " + generator.getNextSerial());

	}

}
