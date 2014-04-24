package com.fmc.component.impl;

import com.fmc.component.Body;

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
public class CarBody implements Body {

	@Override
	public String getBodyParts() {
		return "Body shell parts for a car";
	}

}
