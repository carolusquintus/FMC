package com.fmc.engine;

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
		System.out.println("Engine started");
	}

	@Override
	public void stop() {
		this.running = false;
		this.power = 0;
		System.out.println("Engine stopped");
	}

	@Override
	public void increasePower() {
		if (running && (power < 10)) {
			power++;
			System.out.println("Engine power increased to " + power);
		}
	}

	@Override
	public void decreasePower() {
		if (running && (power > 0)) {
			power--;
			System.out.println("Engine power decreased to " + power);
		}
	}

	@Override
	public String toString() {
		return  new StringBuilder(getClass().getSimpleName()).append(" (").append(this.size).append(")").toString();
	}
	
	
}
