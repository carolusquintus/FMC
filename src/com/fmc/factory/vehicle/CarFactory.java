package com.fmc.factory.vehicle;

import com.fmc.engine.Engine;
import com.fmc.engine.impl.StandardEngine;
import com.fmc.engine.impl.TurboEngine;
import com.fmc.vehicle.Vehicle;
import com.fmc.vehicle.car.impl.Coupe;
import com.fmc.vehicle.car.impl.Saloon;
import com.fmc.vehicle.car.impl.Sport;

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

    @Override
    protected Vehicle selectVehicle(DrivingStyle style, Engine engine) {

        Vehicle vehicle = null;

        switch (style) {
            case ECONOMICAL:
                vehicle = new Saloon(engine);
                break;
            case MIDRANGE:
                vehicle = new Coupe(engine);
                break;
            case POWERFUL:
                vehicle = new Sport(engine);
                break;
        }

        return vehicle;
    }

}
