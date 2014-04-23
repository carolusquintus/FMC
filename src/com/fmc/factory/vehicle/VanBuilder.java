package com.fmc.factory.vehicle;

import com.fmc.factory.component.VanComponentFactory;
import com.fmc.vehicle.Vehicle;
import com.fmc.vehicle.van.AbstractVan;

public class VanBuilder extends VehicleBuilder {
	
	private AbstractVan van;
	
	public VanBuilder(final AbstractVan van) {
		this.van = van;
		super.factory = new VanComponentFactory();
	}

	@Override
	public void buildBody() {
		super.buildBody();
		System.out.println("Building van body");
		factory.createBody().getBodyParts();
	}

	@Override
	public void buildChassis() {
		super.buildChassis();
		System.out.println("Building van chassis");
		factory.createChassis().getChassisParts();
	}

	@Override
	public void buildReinforcedStorageArea() {
		super.buildReinforcedStorageArea();
		System.out.println("Building van storage area");
	}

	@Override
	public void buildWindows() {
		super.buildWindows();
		System.out.println("Building van windows");
		factory.createWindows().getWindowParts();
	}

	@Override
	public Vehicle getVehicle() {
		return this.van;
	}

}
