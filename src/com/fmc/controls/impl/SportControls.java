package com.fmc.controls.impl;

import com.fmc.controls.AbstractDriverControls;
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
public class SportControls extends AbstractDriverControls {
	
	public SportControls(final Engine engine) {
		super(engine);
	}
	
	public void accelerateHard() {
		super.accelerate();
		super.accelerate();
	}
}
