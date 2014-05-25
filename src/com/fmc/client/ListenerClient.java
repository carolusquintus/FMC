package com.fmc.client;

import com.fmc.component.ElectricWindow;
import com.fmc.component.Radio;
import com.fmc.voicecontrol.Command;
import com.fmc.voicecontrol.SpeechRecogniser;
import com.fmc.voicecontrol.impl.VolumeDownCommand;
import com.fmc.voicecontrol.impl.VolumeUpCommand;
import com.fmc.voicecontrol.impl.WindowDownCommand;
import com.fmc.voicecontrol.impl.WindowUpCommand;

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
 * Client class to test Command Pattern
 *
 */
public class ListenerClient {

    private static final Logger log = Logger.getLogger(ListenerClient.class);

    public static void main(String[] args) {

        Radio radio = new Radio();
        radio.on();

        Command volumeUpCommand = new VolumeUpCommand(radio);
        Command volumeDownCommand = new VolumeDownCommand(radio);

        ElectricWindow window = new ElectricWindow();

        Command windowUpCommand = new WindowUpCommand(window);
        Command windowDownCommand = new WindowDownCommand(window);

        SpeechRecogniser recogniser = new SpeechRecogniser();

        recogniser.setCommands(volumeUpCommand, volumeDownCommand);
        log.info("Speech recognition controlling the radio");
        recogniser.hearUpSpoken();
        recogniser.hearCancelUpSpoken();
        recogniser.hearUpSpoken();
        recogniser.hearUpSpoken();
        recogniser.hearDownSpoken();
        recogniser.hearCancelUpSpoken();

        recogniser.setCommands(windowUpCommand, windowDownCommand);
        log.info("Speech recognition will now controll the window");
        recogniser.hearDownSpoken();
        recogniser.hearCancelDownSpoken();
        recogniser.hearUpSpoken();
    }
}
