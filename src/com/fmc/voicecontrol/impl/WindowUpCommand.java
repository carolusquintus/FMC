package com.fmc.voicecontrol.impl;

import com.fmc.component.ElectricWindow;
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
public class WindowUpCommand implements Command {

    private ElectricWindow window;

    public WindowUpCommand(ElectricWindow window) {
        this.window = window;
    }

    @Override
    public void execute() {
        this.window.closeWindow();
    }

    @Override
    public void undo() {
        this.window.openWindow();
    }
}
