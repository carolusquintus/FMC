package com.fmc.component.impl;

import com.fmc.component.Chassis;

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
 */
public class CarChassis implements Chassis {

	@Override
	public String getChassisParts() {
		return "Chassis parts for a car";
	}

}
