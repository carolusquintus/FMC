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
public class Brake {

    private static final Logger log = Logger.getLogger(Brake.class);

    private EngineManagementSystem mediator;
    private boolean enabled;
    private boolean applied;

    public Brake(final EngineManagementSystem mediator) {
        this.mediator = mediator;
        enabled = false;
        applied = false;
        mediator.registerBrake(this);
    }

    public void enable() {
        enabled = true;
        mediator.brakeEnabled();
        log.info("Brakes enabled");
    }

    public void disable() {
        enabled = false;
        mediator.brakeDisabled();
        log.info("Brakes disabled");
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void apply() {
        if (isEnabled()) {
            applied = true;
            mediator.brakePressed();
            log.info("Now braking");
        }
    }

    public void release() {
        if (isEnabled()) {
            applied = false;
        }
    }
}
