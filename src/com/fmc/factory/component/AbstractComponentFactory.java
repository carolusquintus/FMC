package com.fmc.factory.component;

import com.fmc.component.Body;
import com.fmc.component.Chassis;
import com.fmc.component.Windows;

public abstract class AbstractComponentFactory {
	
	public abstract Body createBody();
	
	public abstract Chassis createChassis();
	
	public abstract Windows createWindows();

}
