package com.fmc.agency;

import com.fmc.vehicle.Vehicle;

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
 */
public class VehicleFacade {

	public void prepareForSale(Vehicle vehicle) {
		Registration reg = new Registration(vehicle);
		reg.allocateLicensePlate();
		reg.allocateVehicleNumber();

		Documentation.printBrochure(vehicle);

		vehicle.cleanInterior();
		vehicle.cleanExteriorBody();
		vehicle.polishWindows();
		vehicle.takeForTestDrive();
	}

}
