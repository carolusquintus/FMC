package com.fmc.agency;

import org.apache.log4j.Logger;

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
public class Registration {

	private static Logger logger = Logger.getLogger(Registration.class);

	private Vehicle vehicle;

	public Registration(final Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public void allocateLicensePlate() {
		logger.info("License plate allocated");
	}

	public void allocateVehicleNumber() {
		logger.info("Vehicle number allocated");
	}

}
