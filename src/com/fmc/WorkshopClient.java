package com.fmc;

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
	
	private static Logger logger = Logger.getLogger(WorkshopClient.class);

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
		
		logger.info(standard1.hashCode());
		logger.info(standard2.hashCode());
		logger.info(standard1.equals(standard2));
		logger.info(standard3.hashCode());
		logger.info(standard2.equals(standard3));
		logger.info(standard4.hashCode());
		logger.info(standard3.equals(standard4));
		logger.info(standard5.hashCode());
		logger.info(standard4.equals(standard5));
	}

}
