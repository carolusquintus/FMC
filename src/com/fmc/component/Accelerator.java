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
public class Accelerator {

    private static final Logger log = Logger.getLogger(Accelerator.class);

    private EngineManagementSystem mediator;
    private boolean enabled;
    private int speed;

    public Accelerator(final EngineManagementSystem mediator) {
        this.mediator = mediator;
        enabled = false;
        speed = 0;
        mediator.registerAccelerator(this);
    }

    public void enable() {
        enabled = true;
        mediator.acceleratorEnabled();
        log.info("Accelerator enabled");
    }

    public void disable() {
        enabled = false;
        mediator.acceleratorDisabled();
        log.info("Accelerator disabled");
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void acceleratorToSpeed(int speed) {
        if (isEnabled()) {
            this.speed = speed;
            mediator.acceleratorPressed();
            log.info("Speed now " + getSpeed());
        }
    }

    public int getSpeed() {
        return speed;
    }
}
