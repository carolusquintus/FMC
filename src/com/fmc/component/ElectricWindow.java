package com.fmc.component;

import org.apache.log4j.Logger;

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
public class ElectricWindow {

    private static final Logger log = Logger.getLogger(ElectricWindow.class);

    private boolean open;

    public ElectricWindow(){
        open = false;
        log.info("Window is closed");
    }

    public boolean isOpen(){
        return open;
    }

    public boolean isClosed(){
        return !open;
    }

    public void openWindow(){
        if (isClosed()){
            open = true;
            log.info("Window is now open");
        }
    }

    public void closeWindow(){
        if (isOpen()){
            open = false;
            log.info("Window is now closed");
        }
    }
}
