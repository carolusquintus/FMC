package com.fmc.client;

import com.fmc.persistent.Speedometer;
import com.fmc.persistent.SpeedometerMemento;
import org.apache.log4j.Logger;

import java.io.IOException;

/**
 *
 * Foo Motor Company
 *
 * Based on: "Java Design Pattern Essentials", Tony Bevis
 *
 * Date: Jun 22, 2014
 *
 * @author carolus
 *
 * Client class to test Memento Pattern
 *
 */
public class DashboardClient {

    private static final Logger log = Logger.getLogger(DashboardClient.class);

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Speedometer speedometer = new Speedometer();

        speedometer.setCurrentSpeed(50);
        speedometer.setCurrentSpeed(100);

        SpeedometerMemento memento = new SpeedometerMemento(speedometer);
        log.info("Current speed: " + speedometer.getCurrentSpeed());
        log.info("Previous speed: " + speedometer.getPreviousSpeed());

        speedometer.setCurrentSpeed(80);
        log.info("After setting to 80...");
        log.info("Current speed: " + speedometer.getCurrentSpeed());
        log.info("Previous speed: " + speedometer.getPreviousSpeed());

        log.info("Now restoring state...");
        speedometer = memento.restoreState();
        log.info("Current speed: " + speedometer.getCurrentSpeed());
        log.info("Previous speed: " + speedometer.getPreviousSpeed());
    }
}
