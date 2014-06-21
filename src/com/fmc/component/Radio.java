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
public class Radio {

    public static final Logger log = Logger.getLogger(Radio.class);

    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 10;
    public static final int DEFAULT_VOLUME = 5;

    public boolean on;
    public int volume;

    public Radio() {
        on = false;
        volume = DEFAULT_VOLUME;
    }

    public boolean isOn() {
        return on;
    }

    public int getVolume() {
        return volume;
    }

    public void on() {
        on = true;
        log.info("Radio now on, volume level " + getVolume());
    }

    public void off() {
        on = false;
        log.info("Radios now off");
    }

    public void volumeUp() {
        if (isOn()) {
            if (getVolume() < MAX_VOLUME) {
                volume++;
                log.info("Volume turned up to level " + getVolume());
            }
        }
    }

    public void volumeDown() {
        if (isOn()) {
            if (getVolume() > MIN_VOLUME) {
                volume--;
                log.info("Volume turned down to level " + getVolume());
            }
        }
    }
}
