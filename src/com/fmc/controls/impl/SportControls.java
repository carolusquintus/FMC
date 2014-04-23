package com.fmc.controls.impl;

import com.fmc.controls.AbstractDriverControls;
import com.fmc.engine.Engine;

public class SportControls extends AbstractDriverControls {
	
	public SportControls(final Engine engine) {
		super(engine);
	}
	
	public void accelerateHard() {
		super.accelerate();
		super.accelerate();
	}
}
