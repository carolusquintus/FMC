package com.fmc.factory.component;

import com.fmc.component.Body;
import com.fmc.component.Chassis;
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
public abstract class AbstractComponentFactory {
	
	public abstract Body createBody();
	
	public abstract Chassis createChassis();
	
	public abstract Windows createWindows();

}
