package com.fmc.brochure;

import com.fmc.engine.impl.StandardEngine;
import com.fmc.engine.impl.TurboEngine;
import com.fmc.factory.vehicle.CarFactory;
import com.fmc.factory.vehicle.VehicleFactory;
import com.fmc.factory.vehicle.VehicleFactory.DrivingStyle;
import com.fmc.vehicle.Vehicle;
import com.fmc.vehicle.Vehicle.Colour;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
public class CarRange implements Iterable<Vehicle> {

    private List<Vehicle> cars;
    private VehicleFactory factory;

    public CarRange() {
        factory = new CarFactory();
        cars = new ArrayList<>();

        cars.add(factory.build(DrivingStyle.ECONOMICAL, Colour.UNPAINTED, new StandardEngine(1300)));
        cars.add(factory.build(DrivingStyle.ECONOMICAL, Colour.UNPAINTED, new StandardEngine(1600)));
        cars.add(factory.build(DrivingStyle.MIDRANGE, Colour.UNPAINTED, new StandardEngine(2000)));
        cars.add(factory.build(DrivingStyle.POWERFUL, Colour.UNPAINTED, new TurboEngine(2500)));
    }

    public List<Vehicle> getRange() {
        return cars;
    }

    @Override
    public Iterator<Vehicle> iterator() {
        return cars.listIterator();
    }
}
