package com.fmc.component.impl;

import com.fmc.component.Windows;

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
public class CarWindows implements Windows {

	@Override
	public String getWindowParts() {
		return "Window glassware for a car";
	}

}
