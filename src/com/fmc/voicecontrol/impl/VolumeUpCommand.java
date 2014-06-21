package com.fmc.voicecontrol.impl;

import com.fmc.component.Radio;
import com.fmc.voicecontrol.Command;

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
public class VolumeUpCommand implements Command {

    private Radio radio;

    public VolumeUpCommand(Radio radio) {
        this.radio = radio;
    }

    @Override
    public void execute() {
        this.radio.volumeUp();
    }

    @Override
    public void undo() {
        this.radio.volumeDown();
    }
}
