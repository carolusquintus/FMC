package com.fmc.client;

import com.fmc.component.Accelerator;
import com.fmc.component.Brake;
import com.fmc.component.Gearbox;
import com.fmc.component.Ignition;
import com.fmc.engine.EngineManagementSystem;

/**
 *
 * Foo Motor Company
 *
 * Based on: "Java Design Pattern Essentials", Tony Bevis
 *
 * Date: Jun 20, 2014
 *
 * @author carolus
 *
 * Client class to test Mediator Pattern
 *
 */
public class EngineClient {

    public static void main(String[] args) {

        EngineManagementSystem mediator = new EngineManagementSystem();

        Ignition ignition = new Ignition(mediator);
        Gearbox gearbox = new Gearbox(mediator);
        Accelerator accelerator = new Accelerator(mediator);
        Brake brake = new Brake(mediator);

        mediator.ignitionTurnedOn();

        accelerator.acceleratorToSpeed(100);

        mediator.acceleratorPressed();

    }
}
