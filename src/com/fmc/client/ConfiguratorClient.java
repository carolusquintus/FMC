package com.fmc.client;

import org.apache.log4j.Logger;

import com.fmc.factory.vehicle.CarFactory;
import com.fmc.factory.vehicle.VanFactory;
import com.fmc.factory.vehicle.VehicleFactory;
import com.fmc.factory.vehicle.VehicleFactory.Category;
import com.fmc.factory.vehicle.VehicleFactory.DrivingStyle;
import com.fmc.vehicle.Vehicle;
import com.fmc.vehicle.Vehicle.Colour;

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
 * Client class to test Factory Method Pattern
 *
 */
public class ConfiguratorClient {
	
	private static final Logger logger = Logger.getLogger(ConfiguratorClient.class);

	public static void main(String[] args) {

		VehicleFactory carFactory = new CarFactory();
		Vehicle car = carFactory.build(DrivingStyle.ECONOMICAL, Colour.BLUE);
		logger.info(car);

		VehicleFactory vanFactory = new VanFactory();
		Vehicle van = vanFactory.build(DrivingStyle.POWERFUL, Colour.WHITE);
		logger.info(van);

		Vehicle sporty = VehicleFactory.make(Category.CAR,DrivingStyle.ECONOMICAL, Colour.RED);
		logger.info(sporty);

	}

}
