package com.fmc.client;

import com.fmc.controls.impl.SportControls;
import com.fmc.controls.impl.StandardControls;
import com.fmc.engine.Engine;
import com.fmc.engine.impl.StandardEngine;

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
 * Cliente class to test Bridge Pattern
 *
 */
public class TestDrivingClients {
	
	public static void main(String[] args) {
		
		Engine engine = new StandardEngine(1300);
		StandardControls controls1 = new StandardControls(engine);
		controls1.ignitionOn();
		controls1.accelerate();
		controls1.brake();
		controls1.ignitionOff();
		
		SportControls controls2 = new SportControls(engine);
		controls2.ignitionOn();
		controls2.accelerateHard();
		controls2.brake();
		controls2.ignitionOff();
		
	}
}
