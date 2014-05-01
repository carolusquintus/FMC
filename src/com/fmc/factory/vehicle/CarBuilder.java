package com.fmc.factory.vehicle;

import org.apache.log4j.Logger;

import com.fmc.factory.component.CarComponentFactory;
import com.fmc.vehicle.Vehicle;
import com.fmc.vehicle.car.AbstractCar;

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
public class CarBuilder extends VehicleBuilder {
	
	private static final Logger logger = Logger.getLogger(CarBuilder.class);

	private AbstractCar car;

	public CarBuilder(final AbstractCar car) {
		this.car = car;
		super.factory = new CarComponentFactory();
	}

	@Override
	public void buildBody() {
		super.buildBody();
		logger.info("Building car body");
		factory.createBody().getBodyParts();
	}

	@Override
	public void buildBoot() {
		super.buildBoot();
		logger.info("Building car boot");
	}

	@Override
	public void buildChassis() {
		super.buildChassis();
		logger.info("Building car chassis");
		factory.createChassis().getChassisParts();
	}

	@Override
	public void buildPassengerArea() {
		super.buildPassengerArea();
		logger.info("Building car passenger area");
	}

	@Override
	public void buildWindows() {		
		super.buildWindows();
		logger.info("Building car windows");
		factory.createWindows().getWindowParts();
	}

	@Override
	public Vehicle getVehicle() {
		return this.car;
	}

}
