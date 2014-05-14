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
public class ManagerEmailHandler extends AbstractEmailHandler {

    private static final Logger log = Logger.getLogger(ManagerEmailHandler.class);

    @Override
    protected String[] matchingWords() {
        return new String[]{"complain", "bad"};
    }

    @Override
    protected void handleHere(String email) {
        log.info("Email handled by manager");
        log.info("\t" + email);
    }
}
