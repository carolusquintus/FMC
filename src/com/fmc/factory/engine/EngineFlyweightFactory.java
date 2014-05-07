package com.fmc.factory.engine;

import java.util.HashMap;
import java.util.Map;

import com.fmc.engine.Engine;
import com.fmc.engine.impl.StandardEngine;
import com.fmc.engine.impl.TurboEngine;

/**
 * 
 * Foo Motor Company
 * 
 * Based on: "Java Design Pattern Essentials", Tony Bevis
 * 
 * Date: May 7, 2014
 * 
 * @author carolus
 * 
 */
public class EngineFlyweightFactory {

	private Map<Integer, Engine> standardEnginePool;
	private Map<Integer, Engine> turboEnginePool;

	public EngineFlyweightFactory() {
		this.standardEnginePool = new HashMap<>();
		this.turboEnginePool = new HashMap<>();
	}

	public Engine getStandardEngine(int size) {
		Engine e = standardEnginePool.get(size);
		if (e == null) {
			e = new StandardEngine(size);
			standardEnginePool.put(size, e);
		}

		return e;
	}

	public Engine getTurboEngine(int size) {
		Engine e = turboEnginePool.get(size);
		if (e == null) {
			e = new TurboEngine(size);
			turboEnginePool.put(size, e);
		}

		return e;
	}

}
