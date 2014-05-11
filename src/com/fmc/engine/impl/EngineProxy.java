package com.fmc.engine.impl;

import com.fmc.engine.Engine;
import com.fmc.workshop.DiagnosticTool;
import org.apache.log4j.Logger;

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
 */
public class EngineProxy implements Engine {

    private static final Logger logger = Logger.getLogger(EngineProxy.class);

    private Engine engine;

    public EngineProxy(final int size, final boolean turbo) {
        if (turbo) {
            engine = new TurboEngine(size);
        } else {
            engine = new StandardEngine(size);
        }

    }

    @Override
    public int getSize() {
        return engine.getSize();
    }

    @Override
    public boolean isTurbo() {
        return engine.isTurbo();
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void increasePower() {

    }

    @Override
    public void decreasePower() {

    }

    @Override
    public void diagnose(final DiagnosticTool tool) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                logger.info("Running tool as thread");
                engine.diagnose(tool);
            }
        });

        thread.start();

        logger.info("EngineProxy diagnose() method finished");
    }
}
