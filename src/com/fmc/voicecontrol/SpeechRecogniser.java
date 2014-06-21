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
public class SpeechRecogniser {

    private Command upCommand;
    private Command downCommand;

    public void setCommands(final Command upCommand, final Command downCommand) {
        this.upCommand = upCommand;
        this.downCommand = downCommand;
    }

    public void hearUpSpoken() {
        upCommand.execute();
    }

    public void hearDownSpoken() {
        downCommand.execute();
    }

    public void hearCancelUpSpoken() {
        upCommand.undo();
    }

    public void hearCancelDownSpoken() {
        downCommand.undo();
    }
}
