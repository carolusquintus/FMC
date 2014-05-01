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
 */
public class NumberGeneratorClient {
	
	private static final Logger logger = Logger.getLogger(NumberGeneratorClient.class);

	public static void main(String[] args) {
		logger.info("Using traditional singleton");
		
//		SerialNumberGeneratorTraditional generator = SerialNumberGeneratorTraditional.getInstance();
//		logger.info(generator.hashCode());
//		logger.info("Next serial: " + generator.getNextSerial());
//		generator = SerialNumberGeneratorTraditional.getInstance();
//		logger.info(generator.hashCode());
//		logger.info("Next serial: " + generator.getNextSerial());
//		generator = SerialNumberGeneratorTraditional.getInstance();
//		logger.info(generator.hashCode());
//		logger.info("Next serial: " + generator.getNextSerial());
		
		SerialNumberGenerator generator = SerialNumberGenerator.ENGINE;
		logger.info(generator.hashCode());
		logger.info("Next serial: " + generator.getNextSerial());
		generator = SerialNumberGenerator.VEHICLE;
		logger.info(generator.hashCode());
		logger.info("Next serial: " + generator.getNextSerial());
		generator = SerialNumberGenerator.ENGINE;
		logger.info(generator.hashCode());
		logger.info("Next serial: " + generator.getNextSerial());
		generator = SerialNumberGenerator.VEHICLE;
		logger.info(generator.hashCode());
		logger.info("Next serial: " + generator.getNextSerial());
		generator = SerialNumberGenerator.VEHICLE;
		logger.info(generator.hashCode());
		logger.info("Next serial: " + generator.getNextSerial());

	}

}
