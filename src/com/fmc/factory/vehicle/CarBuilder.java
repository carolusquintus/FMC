package com.fmc.factory.vehicle;

import com.fmc.factory.component.CarComponentFactory;
import com.fmc.vehicle.Vehicle;
import com.fmc.vehicle.car.AbstractCar;

public class CarBuilder extends VehicleBuilder {

	private AbstractCar car;

	public CarBuilder(final AbstractCar car) {
		this.car = car;
		super.factory = new CarComponentFactory();
	}

	@Override
	public void buildBody() {
		super.buildBody();
		System.out.println("Building car body");
		factory.createBody().getBodyParts();
	}

	@Override
	public void buildBoot() {
		super.buildBoot();
		System.out.println("Building car boot");
	}

	@Override
	public void buildChassis() {
		super.buildChassis();
		System.out.println("Building car chassis");
		factory.createChassis().getChassisParts();
	}

	@Override
	public void buildPassengerArea() {
		super.buildPassengerArea();
		System.out.println("Building car passenger area");
	}

	@Override
	public void buildWindows() {		
		super.buildWindows();
		System.out.println("Building car windows");
		factory.createWindows().getWindowParts();
	}

	@Override
	public Vehicle getVehicle() {
		return this.car;
	}

}
