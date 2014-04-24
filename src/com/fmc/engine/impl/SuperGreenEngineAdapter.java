package com.fmc.engine.impl;

import com.fmc.engine.AbstractEngine;
import com.gmc.engine.SuperGreenEngine;

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
public class SuperGreenEngineAdapter extends AbstractEngine {

	public SuperGreenEngineAdapter(final SuperGreenEngine greenEngine) {
		super(greenEngine.getEngineSize(), false);
	}

}
