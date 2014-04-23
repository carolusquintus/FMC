package com.fmc.factory.component;

import com.fmc.component.Body;
import com.fmc.component.Chassis;
import com.fmc.component.Windows;
import com.fmc.component.impl.CarBody;
import com.fmc.component.impl.CarChassis;
import com.fmc.component.impl.CarWindows;

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
