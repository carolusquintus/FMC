package com.fmc.client;

import com.fmc.agency.VehicleFacade;
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
 * Date: May 6, 2014
 *
 * @author carolus
 * 
 * Client class to test Facade Pattern
 *
 */
public class Agency2Client {

	public static void main(String[] args) {
		
        Vehicle vehicle = VehicleFactory.make(Category.CAR, DrivingStyle.POWERFUL, Colour.RED);
		
		VehicleFacade facade = new VehicleFacade();
		facade.prepareForSale(vehicle);
		
	}

}
