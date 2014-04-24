package com.fmc.factory.component;

import com.fmc.component.Body;
import com.fmc.component.Chassis;
import com.fmc.component.Windows;
import com.fmc.component.impl.CarBody;
import com.fmc.component.impl.CarChassis;
import com.fmc.component.impl.CarWindows;

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
public class CarComponentFactory extends AbstractComponentFactory {

	@Override
	public Body createBody() {
		return new CarBody();
	}

	@Override
	public Chassis createChassis() {
		return new CarChassis();
	}

	@Override
	public Windows createWindows() {
		return new CarWindows();
	}

}
