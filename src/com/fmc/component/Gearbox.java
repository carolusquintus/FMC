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
public class Gearbox {

    public static final Logger log = Logger.getLogger(Gearbox.class);

    public enum Gear {NEUTRAL, FIRST, SECOND, THIRD, FOURTH, FIFTH, SIXTH, REVERSE};

    private EngineManagementSystem mediator;
    private boolean enabled;
    private Gear currentGear;

    public Gearbox(final EngineManagementSystem mediator) {
        this.mediator = mediator;
        enabled = false;
        currentGear = Gear.NEUTRAL;
        mediator.registerGearbox(this);
    }

    public void enable() {
        enabled = true;
        mediator.gearboxEnabled();
        log.info("Gearbox enabled");
    }

    public void disable() {
        enabled = false;
        mediator.gearboxDisabled();
        log.info("Gearbox disabled");
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setGear(final Gear gear) {
        if (isEnabled() && getGear() != gear) {
            currentGear = gear;
            mediator.gearChanged();
            log.info("Now in " + getGear() + " gear");
        }
    }

    public Gear getGear() {
        return currentGear;
    }
}
