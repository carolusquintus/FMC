package com.fmc.client;

import com.fmc.brochure.CarRange;
import com.fmc.brochure.VanRange;
import com.fmc.vehicle.Vehicle;
import org.apache.log4j.Logger;

import java.util.Iterator;

/**
 *
 * Foo Motor Company
 *
 * Based on: "Java Design Pattern Essentials", Tony Bevis
 *
 * Date: Jun 02, 2014
 *
 * @author carolus
 *
 * Client class to test Iterator Pattern
 *
 */
public class RangeClient {

    private static final Logger log = Logger.getLogger(RangeClient.class);

    public static void main(String[] args) {
        log.info("=== Our Cars ===");
        CarRange carRange = new CarRange();
        printIterator(carRange.iterator());

        log.info("=== Our Vans ===");
        VanRange vanRange = new VanRange();
        printIterator(vanRange.iterator());

        log.info("=== Our Cars ===");
        for(Vehicle vehicle : carRange.getRange()) {
            log.info(vehicle);
        }

        log.info("=== Our Vans ===");
        for(Vehicle vehicle : vanRange.getRange()) {
            log.info(vehicle);
        }
    }

    public static void printIterator(Iterator iterator) {
        while (iterator.hasNext()) {
            log.info(iterator.next());
        }
    }
}
