package org.example.designPatterns.Decorator;

public class SignedEmail extends EmailDecorator{
    public SignedEmail(Email email) {
        super(email);
    }

    @Override
    public void sendEmail() {
        System.out.println("Email Signed");
        super.sendEmail();
    }
}
