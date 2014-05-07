package com.fmc.engine;

import com.fmc.workshop.DiagnosticTool;

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
public interface Engine {

	public int getSize();

	public boolean isTurbo();

	public void start();

	public void stop();

	public void increasePower();

	public void decreasePower();

	public void diagnose(DiagnosticTool tool);

}
