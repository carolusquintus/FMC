package com.fmc.client;

import org.apache.log4j.Logger;

import com.fmc.engine.Engine;
import com.fmc.factory.engine.EngineFlyweightFactory;
import com.fmc.workshop.impl.EngineDiagnosticTool;

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
 * Client class to test Flyweight Pattern
 *
 */
public class WorkshopClient {

	private static final Logger log = Logger.getLogger(WorkshopClient.class);

	public static void main(String[] args) {
		
		EngineFlyweightFactory factory = new EngineFlyweightFactory();
		EngineDiagnosticTool tool = new EngineDiagnosticTool();
		
		Engine standard1 = factory.getStandardEngine(1300);
		standard1.diagnose(tool);
		
		Engine standard2 = factory.getStandardEngine(1300);
		standard2.diagnose(tool);
		
		Engine standard3 = factory.getStandardEngine(1300);
		standard3.diagnose(tool);
		
		Engine standard4 = factory.getStandardEngine(1600);
		standard4.diagnose(tool);
		
		Engine standard5 = factory.getStandardEngine(1600);
		standard5.diagnose(tool);
		
		log.info(standard1.hashCode());
		log.info(standard2.hashCode());
		log.info(standard1.equals(standard2));
		log.info(standard3.hashCode());
		log.info(standard2.equals(standard3));
		log.info(standard4.hashCode());
		log.info(standard3.equals(standard4));
		log.info(standard5.hashCode());
		log.info(standard4.equals(standard5));
	}

}
