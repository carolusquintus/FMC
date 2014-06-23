package com.fmc.persistent;

import java.io.*;

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
public class SpeedometerMemento {

    private Speedometer speedometer;

    // Attributes for Memento Pattern first approach
    //private int copyOfCurrentSpeed;
    //private int copyOfPreviousSpeed;

    public SpeedometerMemento(Speedometer speedometer) throws IOException {

        File speedometerFile = new File("speedometer.ser");
        ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(speedometerFile)));
        oos.writeObject(speedometer);
        oos.close();

        // Setting for Memento Pattern first approach
        //this.speedometer = speedometer;
        //copyOfCurrentSpeed = speedometer.getCurrentSpeed();
        //copyOfPreviousSpeed = speedometer.previousSpeed;
    }

    public Speedometer restoreState() throws IOException, ClassNotFoundException {

        File speedometerFile = new File("speedometer.ser");
        ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(speedometerFile)));
        Speedometer speedometerRestored = (Speedometer) ois.readObject();
        ois.close();

        return speedometerRestored;
        // Getting for Memento Pattern first approach
        //speedometer.setCurrentSpeed(copyOfCurrentSpeed);
        //speedometer.previousSpeed = copyOfPreviousSpeed;
    }
}