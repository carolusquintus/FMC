package com.fmc.reception;

import com.fmc.reception.impl.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * Foo Motor Company
 *
 * Based on: "Java Design Pattern Essentials", Tony Bevis
 *
 * Date: May 11, 2014
 *
 * @author carolus
 *
 */
public abstract class AbstractEmailHandler implements EmailHandler {

    private EmailHandler nextHandler;

    @Override
    public void setNextHandler(EmailHandler handler) {
        nextHandler = handler;
    }

    @Override
    public void processHandler(String email) {
        boolean wordFound = false;

        if (matchingWords().length == 0) {
            wordFound = true;
        } else {
            for(String word: matchingWords()) {
                if(matchWord(word, email)) {
                    wordFound = true;
                    break;
                }
            }
        }

        if(wordFound) {
            handleHere(email);
        } else {
            nextHandler.processHandler(email);
        }
    }

    public static void handle(String email) {
        EmailHandler spam = new SpamEmailHandler();
        EmailHandler sales = new SalesEmailHandler();
        EmailHandler service = new ServiceEmailHandler();
        EmailHandler manager = new ManagerEmailHandler();
        EmailHandler general = new GeneralEnquiriesEmailHandler();

        spam.setNextHandler(sales);
        sales.setNextHandler(service);
        service.setNextHandler(manager);
        manager.setNextHandler(general);

        spam.processHandler(email);
    }

    private boolean matchWord(String word, String email) {

        Pattern pattern = Pattern.compile(word);
        Matcher matcher = pattern.matcher(email);

        return matcher.lookingAt();
    }

    protected abstract String[] matchingWords();

    protected abstract void handleHere(String email);
}
