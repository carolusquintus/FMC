package com.fmc.client;

import com.fmc.engine.impl.EngineProxy;
import com.fmc.workshop.impl.EngineDiagnosticTool;

/**
 *
 * Foo Motor Company
 *
 * Based on: "Java Design Pattern Essentials", Tony Bevis
 *
 * Date: May 11, 2014
 *
 * @author carolus
 *
 * Client class to test Proxy Pattern
 *
 */
public class Workshop2Client {

    public static void main(String[] args) {

        EngineProxy proxy = new EngineProxy(1300, true);
        proxy.diagnose(new EngineDiagnosticTool());

    }
}
