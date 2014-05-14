package com.fmc.reception;

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
public interface EmailHandler {

    public void setNextHandler(EmailHandler handler);

    public void processHandler(String email);
}
