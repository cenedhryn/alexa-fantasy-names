package com.grainoftech.alexa.fantasynames;


import com.amazon.speech.speechlet.SpeechletV2;
import com.amazon.speech.speechlet.lambda.SpeechletRequestStreamHandler;

import java.util.HashSet;
import java.util.Set;

public final class FantasyNamesSpeechletRequestStreamHandler extends SpeechletRequestStreamHandler {

    private static final Set<String> supportedApplicationIds;

    static {
        supportedApplicationIds = new HashSet<String>();
        supportedApplicationIds.add("amzn1.ask.skill.34a8b8a6-a7cb-469d-a571-e9d3cb6a8380");
    }

    public FantasyNamesSpeechletRequestStreamHandler() {
        super(new FantasyNamesSpeechlet(), supportedApplicationIds);
    }

    public FantasyNamesSpeechletRequestStreamHandler(SpeechletV2 speechlet, Set<String> supportedApplicationIds) {
        super(speechlet, supportedApplicationIds);
    }
}
