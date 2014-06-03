package com.fmc.factory.vehicle;

import com.fmc.engine.Engine;
import com.fmc.vehicle.Vehicle;
import com.fmc.vehicle.Vehicle.Colour;

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
public abstract class VehicleFactory {

	public enum DrivingStyle {
		ECONOMICAL, MIDRANGE, POWERFUL
	}

	public enum Category {
		CAR, VAN
	}

	public static Vehicle make(final Category category, final DrivingStyle style, final Colour colour) {
		VehicleFactory factory = null;
		
		switch (category) {
		case CAR:
			factory = new CarFactory();
			break;
		case VAN:
			factory = new VanFactory();
			break;
		}
		
		return factory.build(style, colour);
	}

    public static Vehicle make(final Category category, final DrivingStyle style, final Colour colour, final Engine engine) {
        VehicleFactory factory = null;

        switch (category) {
            case CAR:
                factory = new CarFactory();
                break;
            case VAN:
                factory = new VanFactory();
                break;
        }

        return factory.build(style, colour, engine);
    }

	public Vehicle build(final DrivingStyle style, final Colour colour) {

		Vehicle v = selectVehicle(style);
		v.paint(colour);
		return v;
	}

    public Vehicle build(final DrivingStyle style, final Colour colour, final Engine engine) {

        Vehicle v = selectVehicle(style, engine);
        v.paint(colour);
        return v;
    }


	protected abstract Vehicle selectVehicle(final DrivingStyle style);

    protected abstract Vehicle selectVehicle(final DrivingStyle style, final Engine engine);

}
