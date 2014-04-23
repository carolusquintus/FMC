package com.fmc.client;

import java.util.ArrayList;
import java.util.List;

import com.fmc.engine.Engine;
import com.fmc.engine.impl.StandardEngine;
import com.fmc.engine.impl.SuperGreenEngineAdapter;
import com.fmc.engine.impl.TurboEngine;
import com.gmc.engine.SuperGreenEngine;

public class ProductionEngineClient {

	public static void main(String[] args) {
		
		List<Engine> engines = new ArrayList();
		engines.add(new StandardEngine(1300));
		engines.add(new StandardEngine(1300));
		engines.add(new TurboEngine(1300));
		
		SuperGreenEngine greenEngine = new SuperGreenEngine(1200);
		engines.add(new SuperGreenEngineAdapter(greenEngine));
		
		System.out.println(greenEngine);
		
		for (Engine engine : engines) {
			System.out.println(engine);
		}
	}

}
