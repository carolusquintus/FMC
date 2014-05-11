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

	private static final Logger log = Logger.getLogger(Registration.class);

	private Vehicle vehicle;

	public Registration(final Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public void allocateLicensePlate() {
		log.info("License plate allocated");
	}

	public void allocateVehicleNumber() {
		log.info("Vehicle number allocated");
	}

}
