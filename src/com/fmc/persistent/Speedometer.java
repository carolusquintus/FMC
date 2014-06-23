package com.fmc.persistent;

import java.io.Serializable;

/**
 *
 * Foo Motor Company
 *
 * Based on: "Java Design Pattern Essentials", Tony Bevis
 *
 * Date: Jun 22, 2014
 *
 * @author carolus
 *
 */
public class Speedometer implements Serializable {

    private int currentSpeed;

    private int previousSpeed;

    public Speedometer() {
        currentSpeed = 0;
        previousSpeed = 0;
    }

    public void setCurrentSpeed(int currentSpeed) {
        previousSpeed = this.currentSpeed;
        this.currentSpeed = currentSpeed;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getPreviousSpeed() {
        return previousSpeed;
    }
}
