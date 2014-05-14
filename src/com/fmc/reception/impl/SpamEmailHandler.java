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
public class SpamEmailHandler extends AbstractEmailHandler {

    private static final Logger log = Logger.getLogger(SpamEmailHandler.class);

    @Override
    protected String[] matchingWords() {
        return new String[]{"viagra", "pills", "medicines"};
    }

    @Override
    protected void handleHere(String email) {
        log.info("This is a spam email");
        log.info("\t" + email);
    }
}