package org.example.designPatterns.Decorator;

public class ConfidentialEmail extends EmailDecorator{
    public ConfidentialEmail(Email email) {
        super(email);
    }

    @Override
    public void sendEmail() {
        System.out.println("Email made Confidential");
        super.sendEmail();
    }
}
