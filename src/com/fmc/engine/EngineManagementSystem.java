package com.fmc.engine;

import com.fmc.component.Accelerator;
import com.fmc.component.Brake;
import com.fmc.component.Gearbox;
import com.fmc.component.Gearbox.Gear;
import com.fmc.component.Ignition;
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
public class EngineManagementSystem {

    private static final Logger log = Logger.getLogger(EngineManagementSystem.class);

    private Ignition ignition;
    private Gearbox gearbox;
    private Accelerator accelerator;
    private Brake brake;

    private int currentSpeed;

    public EngineManagementSystem() {
        currentSpeed = 0;
    }

    public void registerIgnition(final Ignition ignition) {
        this.ignition = ignition;
    }

    public void registerGearbox(final Gearbox gearbox) {
        this.gearbox = gearbox;
    }

    public void registerAccelerator(final Accelerator accelerator) {
        this.accelerator = accelerator;
    }

    public void registerBrake(final Brake brake) {
        this.brake = brake;
    }

    public void ignitionTurnedOn() {
        gearbox.enable();
        accelerator.enable();
        brake.enable();
    }

    public void ignitionTurnedOff() {
        gearbox.disable();
        accelerator.disable();
        brake.disable();
    }

    public void gearboxEnabled() {
        log.info("EMS now controlling the gearbox");
    }

    public void gearboxDisabled() {
        log.info("EMS no longer controlling the gearbox");
    }

    public void gearChanged() {
        log.info("EMS disengaging revs while gear changing");
    }

    public void acceleratorEnabled() {
        log.info("EMS now controlling the accelerator");
    }

    public void acceleratorDisabled() {
        log.info("EMS no longer controlling the accelerator");
    }

    public void acceleratorPressed() {
        brake.disable();

        while (currentSpeed < accelerator.getSpeed()) {
            currentSpeed++;

            log.info("Speed currently " + currentSpeed);

            if (currentSpeed <= 10) {
                gearbox.setGear(Gear.FIRST);
            } else if (currentSpeed <= 20) {
                gearbox.setGear(Gear.SECOND);
            } else if (currentSpeed <= 30) {
                gearbox.setGear(Gear.THIRD);
            } else if (currentSpeed <= 50) {
                gearbox.setGear(Gear.FOURTH);
            } else {
                gearbox.setGear(Gear.FIFTH);
            }
        }

        brake.enable();
    }

    public void brakeEnabled() {
        log.info("EMS now controlling the brakes");
    }

    public void brakeDisabled(){
        log.info("EMS no longer contrlling the brakes");
    }

    public void brakePressed() {
        accelerator.disable();
        currentSpeed = 0;
    }

    public void brakeReleased(){
        gearbox.setGear(Gear.FIRST);
        accelerator.enable();
    }
}