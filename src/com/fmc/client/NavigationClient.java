package com.fmc.client;

import com.fmc.navigation.interpreter.DirectionalEvaluator;
import org.apache.log4j.Logger;

/**
 *
 * Foo Motor Company
 *
 * Based on: "Java Design Pattern Essentials", Tony Bevis
 *
 * Date: May 25, 2014
 *
 * @author carolus
 *
 * Client class to test Interpreter Pattern
 *
 */
public class NavigationClient {

    private static final Logger log = Logger.getLogger(NavigationClient.class);

    public static void main(String[] args) {

        DirectionalEvaluator evaluator = new DirectionalEvaluator();

        log.info(evaluator.evaluate("london edinburgh manchester southerly"));

        log.info(evaluator.evaluate("london edinburgh manchester southerly aberdeen westerly"));
    }
}
