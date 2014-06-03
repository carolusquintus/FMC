package com.fmc.factory.vehicle;

import com.fmc.engine.Engine;
import com.fmc.engine.impl.StandardEngine;
import com.fmc.engine.impl.TurboEngine;
import com.fmc.vehicle.Vehicle;
import com.fmc.vehicle.van.impl.BoxVan;
import com.fmc.vehicle.van.impl.Pickup;

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
public class VanFactory extends VehicleFactory {

	@Override
	protected Vehicle selectVehicle(DrivingStyle style) {
		
		Vehicle vehicle = null;
		
		switch (style) {
		case ECONOMICAL:
		case MIDRANGE:
			vehicle = new Pickup(new StandardEngine(2200));
			break;
		case POWERFUL:
			vehicle = new BoxVan(new TurboEngine(2500));
			break;
		}
		
		return vehicle;
	}

    @Override
    protected Vehicle selectVehicle(DrivingStyle style, Engine engine) {

        Vehicle vehicle = null;

        switch (style) {
            case ECONOMICAL:
            case MIDRANGE:
                vehicle = new Pickup(engine);
                break;
            case POWERFUL:
                vehicle = new BoxVan(engine);
                break;
        }

        return vehicle;
    }

}
