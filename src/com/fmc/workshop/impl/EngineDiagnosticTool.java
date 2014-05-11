package com.fmc.workshop.impl;

import org.apache.log4j.Logger;

import com.fmc.workshop.DiagnosticTool;

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
public class EngineDiagnosticTool implements DiagnosticTool {

	private static final Logger log = Logger.getLogger(EngineDiagnosticTool.class);

	@Override
	public void runDiagnosis(Object object) {
		log.info("Starting engine diagnostic tool for " + object);

		try {
			Thread.sleep(5000);
			log.info("Engine diagnosis complete");
		} catch (InterruptedException e) {
			log.info("Engine diagnosis interrupted");
		}
	}

}
