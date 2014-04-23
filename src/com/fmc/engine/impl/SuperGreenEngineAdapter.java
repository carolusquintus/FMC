package com.fmc.engine.impl;

import com.fmc.engine.AbstractEngine;
import com.gmc.engine.SuperGreenEngine;

public class SuperGreenEngineAdapter extends AbstractEngine {

	public SuperGreenEngineAdapter(final SuperGreenEngine greenEngine) {
		super(greenEngine.getEngineSize(), false);
	}

}
