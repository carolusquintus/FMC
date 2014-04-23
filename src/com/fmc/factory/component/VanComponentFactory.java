package com.fmc.factory.component;

import com.fmc.component.Body;
import com.fmc.component.Chassis;
import com.fmc.component.Windows;
import com.fmc.component.impl.VanBody;
import com.fmc.component.impl.VanChassis;
import com.fmc.component.impl.VanWindows;

public class VanComponentFactory extends AbstractComponentFactory {

	@Override
	public Body createBody() {
		return new VanBody();
	}

	@Override
	public Chassis createChassis() {
		return new VanChassis();
	}

	@Override
	public Windows createWindows() {
		return new VanWindows();
	}

}
