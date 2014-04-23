package com.fmc.controls;

import com.fmc.engine.Engine;

public abstract class AbstractDriverControls {
	
	private Engine engine;
	
	public AbstractDriverControls(final Engine engine){
		this.engine = engine;
	}
	
	public void ignitionOn(){
		engine.start();		
	}
	
	public void ignitionOff(){
		engine.stop();
	}
	
	public void accelerate(){
		engine.increasePower();
	}
	
	public void brake(){
		engine.decreasePower();
	}

}
