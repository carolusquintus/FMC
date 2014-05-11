package com.fmc.client;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.fmc.engine.Engine;
import com.fmc.engine.impl.StandardEngine;
import com.fmc.engine.impl.SuperGreenEngineAdapter;
import com.fmc.engine.impl.TurboEngine;
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
 * Client class to test Adapter Pattern
 *
 */
public class ProductionEngineClient {
	
	private static final Logger log = Logger.getLogger(ProductionEngineClient.class);

	public static void main(String[] args) {
		
		List<Engine> engines = new ArrayList<>();
		engines.add(new StandardEngine(1300));
		engines.add(new StandardEngine(1300));
		engines.add(new TurboEngine(1300));
		
		SuperGreenEngine greenEngine = new SuperGreenEngine(1200);
		engines.add(new SuperGreenEngineAdapter(greenEngine));
		
		log.info(greenEngine);
		
		for (Engine engine : engines) {
			log.info(engine);
		}
	}

}
