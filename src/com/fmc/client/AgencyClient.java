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
	
	private static final Logger log = Logger.getLogger(AgencyClient.class);

	public static void main(String[] args) {
		
		VehicleManagerLazy manager = new VehicleManagerLazy();
		
		Vehicle vehicle1 = manager.createSaloon();
		Vehicle vehicle2 = manager.createSaloon();
		
		//log.info(vehicle1.hashCode());
		//log.info(vehicle2.hashCode());
		
		log.info(vehicle1 == vehicle2);
		
		log.info(vehicle1.equals(vehicle2));

	}

}
