package com.fmc.factory.vehicle;

import org.apache.log4j.Logger;

import com.fmc.factory.component.VanComponentFactory;
import com.fmc.vehicle.Vehicle;
import com.fmc.vehicle.van.AbstractVan;

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
public class VanBuilder extends VehicleBuilder {
	
	private static final Logger log = Logger.getLogger(VanBuilder.class);
	
	private AbstractVan van;
	
	public VanBuilder(final AbstractVan van) {
		this.van = van;
		super.factory = new VanComponentFactory();
	}

	@Override
	public void buildBody() {
		super.buildBody();
		log.info("Building van body");
		factory.createBody().getBodyParts();
	}

	@Override
	public void buildChassis() {
		super.buildChassis();
		log.info("Building van chassis");
		factory.createChassis().getChassisParts();
	}

	@Override
	public void buildReinforcedStorageArea() {
		super.buildReinforcedStorageArea();
		log.info("Building van storage area");
	}

	@Override
	public void buildWindows() {
		super.buildWindows();
		log.info("Building van windows");
		factory.createWindows().getWindowParts();
	}

	@Override
	public Vehicle getVehicle() {
		return this.van;
	}

}
