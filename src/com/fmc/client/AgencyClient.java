package com.fmc.client;

import org.apache.log4j.Logger;

import com.fmc.manager.VehicleManagerLazy;
import com.fmc.vehicle.Vehicle;

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
 * Client class to test Prototype Pattern
 *
 */
public class AgencyClient {
	
	private static final Logger logger = Logger.getLogger(AgencyClient.class);

	public static void main(String[] args) {
		
		VehicleManagerLazy manager = new VehicleManagerLazy();
		
		Vehicle vehicle1 = manager.createSaloon();
		Vehicle vehicle2 = manager.createSaloon();
		
		//logger.info(vehicle1.hashCode());
		//logger.info(vehicle2.hashCode());
		
		logger.info(vehicle1 == vehicle2);
		
		logger.info(vehicle1.equals(vehicle2));

	}

}
