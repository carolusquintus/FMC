package com.fmc.component;

import com.fmc.engine.EngineManagementSystem;
import org.apache.log4j.Logger;

/**
 *
 * Foo Motor Company
 *
 * Based on: "Java Design Pattern Essentials", Tony Bevis
 *
 * Date: Jun 07, 2014
 *
 * @author carolus
 *
 */
public class Ignition {

    private static final Logger log = Logger.getLogger(Ignition.class);

    private EngineManagementSystem mediator;
    private boolean on;

    public Ignition(final EngineManagementSystem mediator) {
        this.mediator = mediator;
        on = false;

        mediator.registerIgnition(this);
    }

    public void start() {
        on = true;
        mediator.ignitionTurnedOn();
        log.info("Ignition turned on");
    }

    public void stop() {
        on = false;
        mediator.ignitionTurnedOff();
        log.info("Ignition turned off");
    }

    public boolean isOn() {
        return on;
    }
}
