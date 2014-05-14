package com.fmc.reception.impl;

import com.fmc.reception.AbstractEmailHandler;
import org.apache.log4j.Logger;

/**
 *
 * Foo Motor Company
 *
 * Based on: "Java Design Pattern Essentials", Tony Bevis
 *
 * Date: May 12, 2014
 *
 * @author carolus
 *
 */
public class SalesEmailHandler extends AbstractEmailHandler {

    private static final Logger log = Logger.getLogger(SalesEmailHandler.class);

    @Override
    protected String[] matchingWords() {
        return new String[]{"buy", "purchase"};
    }

    @Override
    protected void handleHere(String email) {
        log.info("Email handled by sales department");
        log.info("\t" + email);
    }
}
