package com.fmc.voicecontrol;

/**
 *
 * Foo Motor Company
 *
 * Based on: "Java Design Pattern Essentials", Tony Bevis
 *
 * Date: May 24, 2014
 *
 * @author carolus
 *
 */
public interface Command {

    public void execute();

    public void undo();
}
