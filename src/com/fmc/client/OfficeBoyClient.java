package com.fmc.client;

import com.fmc.reception.AbstractEmailHandler;

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
 * Client class to test Chain of Responsability Pattern
 *
 */
public class OfficeBoyClient {

    public static void main(String[] args) {
        String email = "I need my car repaired.";

        AbstractEmailHandler.handle(email);
    }
}
