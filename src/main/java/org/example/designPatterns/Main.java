package org.example.designPatterns;

import org.example.designPatterns.Decorator.*;

public class Main {
    public static void main(String[] args) {

        Email email = new BasicEmail();

        boolean isConfidential = true;
        boolean isScheduled = true;
        boolean isSigned = true;

        if(isConfidential){
            email = new ConfidentialEmail(email);
        }
        if(isSigned){
            email = new SignedEmail(email);
        }
        if(isScheduled){
            email = new ScheduledEmail(email);
        }

        email.sendEmail();
    }
}