package com.fmc.controls;

import com.fmc.engine.Engine;

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
public abstract class AbstractDriverControls {
	
	private Engine engine;
	
	public AbstractDriverControls(final Engine engine) {
		this.engine = engine;
	}
	
	public void ignitionOn() {
		engine.start();		
	}
	
	public void ignitionOff() {
		engine.stop();
	}
	
	public void accelerate() {
		engine.increasePower();
	}
	
	public void brake() {
		engine.decreasePower();
	}

}
