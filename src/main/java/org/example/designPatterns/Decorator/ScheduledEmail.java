package org.example.designPatterns.Decorator;

public class ScheduledEmail extends EmailDecorator{
    public ScheduledEmail(Email email) {
        super(email);
    }

    @Override
    public void sendEmail() {
        System.out.println("Email Scheduled");
        super.sendEmail();
    }
}
