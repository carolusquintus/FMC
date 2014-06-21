package com.fmc.brochure;

import com.fmc.engine.impl.StandardEngine;
import com.fmc.engine.impl.TurboEngine;
import com.fmc.factory.vehicle.VanFactory;
import com.fmc.factory.vehicle.VehicleFactory;
import com.fmc.factory.vehicle.VehicleFactory.DrivingStyle;
import com.fmc.vehicle.Vehicle;
import com.fmc.vehicle.Vehicle.Colour;

import java.util.Arrays;
import java.util.Iterator;

/**
 *
 * Foo Motor Company
 *
 * Based on: "Java Design Pattern Essentials", Tony Bevis
 *
 * Date: Jun 01, 2014
 *
 * @author carolus
 *
 */
public class VanRange implements Iterable<Vehicle> {

    private Vehicle[] vans;
    private VehicleFactory factory;

    public VanRange() {
        vans = new Vehicle[3];

        factory = new VanFactory();

        vans[0] = factory.build(DrivingStyle.POWERFUL, Colour.UNPAINTED, new StandardEngine(1600));
        vans[1] = factory.build(DrivingStyle.POWERFUL, Colour.UNPAINTED, new StandardEngine(2000));
        vans[2] = factory.build(DrivingStyle.ECONOMICAL, Colour.UNPAINTED, new TurboEngine(2200));
    }

    public Vehicle[] getRange() {
        return vans;
    }

    @Override
    public Iterator<Vehicle> iterator() {
        return Arrays.asList(vans).listIterator();
    }
}
