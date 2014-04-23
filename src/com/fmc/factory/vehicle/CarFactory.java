package com.fmc.factory.vehicle;

import com.fmc.engine.impl.StandardEngine;
import com.fmc.engine.impl.TurboEngine;
import com.fmc.vehicle.Vehicle;
import com.fmc.vehicle.car.impl.Coupe;
import com.fmc.vehicle.car.impl.Saloon;
import com.fmc.vehicle.car.impl.Sport;

public class CarFactory extends VehicleFactory {

	@Override
	protected Vehicle selectVehicle(DrivingStyle style) {
		
		Vehicle vehicle = null;
		
		switch (style) {
		case ECONOMICAL:
			vehicle = new Saloon(new StandardEngine(1300));
			break;
		case MIDRANGE:
			vehicle = new Coupe(new StandardEngine(1600));
			break;
		case POWERFUL:
			vehicle = new Sport(new TurboEngine(2000));
			break;
		}
		
		return vehicle;
	}

}
