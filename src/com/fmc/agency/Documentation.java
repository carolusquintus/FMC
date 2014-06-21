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
public class Documentation {
	
	private static final Logger log = Logger.getLogger(Documentation.class);
	
	public static void printBrochure(final Vehicle vehicle) {
		log.info("Brochure printed");
	}
}
