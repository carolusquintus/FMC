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
public class WindowDownCommand implements Command{

    private ElectricWindow window;

    public WindowDownCommand(ElectricWindow window){
        this.window = window;
    }

    @Override
    public void execute() {
        window.openWindow();
    }

    @Override
    public void undo() {
        window.closeWindow();
    }
}
