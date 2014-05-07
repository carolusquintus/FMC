package com.fmc.engine;

import org.apache.log4j.Logger;

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
public abstract class AbstractEngine implements Engine {
	
	private static final Logger logger = Logger.getLogger(AbstractEngine.class);
	
	private int size;
	private boolean turbo;
	private boolean running;
	private int power;
	
	public AbstractEngine(final int size, final boolean turbo) {
		this.size = size;
		this.turbo = turbo;
		this.running = false;
		this.power = 0;
	}

	@Override
	public int getSize() {
		return this.size;
	}

	@Override
	public boolean isTurbo() {
		return this.turbo;
	}

	@Override
	public void start() {
		this.running = true;
		logger.info("Engine started");
	}

	@Override
	public void stop() {
		this.running = false;
		this.power = 0;
		logger.info("Engine stopped");
	}

	@Override
	public void increasePower() {
		if (running && (power < 10)) {
			power++;
			logger.info("Engine power increased to " + power);
		}
	}

	@Override
	public void decreasePower() {
		if (running && (power > 0)) {
			power--;
			logger.info("Engine power decreased to " + power);
		}
	}

	@Override
	public void diagnose(DiagnosticTool tool) {
		tool.runDiagnosis(this);
	}

	@Override
	public String toString() {
		return new StringBuilder(getClass().getSimpleName()).append(" (").append(this.size).append(")").toString();
	}
	
	
}
