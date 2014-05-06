package com.fmc.client;

import org.apache.log4j.Logger;

import com.fmc.factory.vehicle.VehicleFactory;
import com.fmc.factory.vehicle.VehicleFactory.Category;
import com.fmc.factory.vehicle.VehicleFactory.DrivingStyle;
import com.fmc.vehicle.Vehicle;
import com.fmc.vehicle.Vehicle.Colour;
import com.fmc.vehicle.option.impl.AirConditionedVehicle;
import com.fmc.vehicle.option.impl.AlloyWheeledVehicle;
import com.fmc.vehicle.option.impl.LeatherSeatedVehicle;
import com.fmc.vehicle.option.impl.MetallicPaintedVehicle;
import com.fmc.vehicle.option.impl.SatNavVehicle;

/**
 *
 * Foo Motor Company
 *
 * Based on: "Java Design Pattern Essentials", Tony Bevis
 *
 * Date: May 5, 2014
 *
 * @author carolus
 * 
 * Client class to test Decorator Pattern
 *
 */
public class Configurator2Client {
	
	private static final Logger logger = Logger.getLogger(Configurator2Client.class);

	public static void main(String[] args) {
		Vehicle vehicle = VehicleFactory.make(Category.CAR, DrivingStyle.ECONOMICAL, Colour.BLUE);
		logger.info(vehicle);
		
		vehicle = new AirConditionedVehicle(vehicle);
		logger.info(vehicle);
		vehicle = new AlloyWheeledVehicle(vehicle);
		logger.info(vehicle);
		vehicle = new LeatherSeatedVehicle(vehicle);
		logger.info(vehicle);
		vehicle = new MetallicPaintedVehicle(vehicle);
		logger.info(vehicle);
		vehicle = new SatNavVehicle(vehicle);
		logger.info(vehicle);
	}

}
