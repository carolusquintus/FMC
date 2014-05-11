package com.fmc.client;

import org.apache.log4j.Logger;

import com.fmc.engine.impl.StandardEngine;
import com.fmc.factory.vehicle.CarBuilder;
import com.fmc.factory.vehicle.CarDirector;
import com.fmc.factory.vehicle.VehicleBuilder;
import com.fmc.factory.vehicle.VehicleDirector;
import com.fmc.vehicle.Vehicle;
import com.fmc.vehicle.car.AbstractCar;
import com.fmc.vehicle.car.impl.Saloon;

/**
 *
 * Foo Motor Company
 *
 * Based on: "Java Design Pattern Essentials", Tony Bevis
 *
 * Date: May 1, 2014
 *
 * @author carolus
 * 
 * Client class to test Builder Pattern
 *
 */
public class ManufacturerClient {

	private static final Logger log = Logger.getLogger(ManufacturerClient.class);
	
	public static void main(String[] args) {
		 AbstractCar car = new Saloon(new StandardEngine(1300));
		 VehicleBuilder builder = new CarBuilder(car);
		 VehicleDirector director = new CarDirector();
		
		 Vehicle v = director.build(builder);
		
		 log.info(v);
	}

}
