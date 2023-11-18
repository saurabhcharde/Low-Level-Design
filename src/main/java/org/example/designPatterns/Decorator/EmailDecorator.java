package org.example.designPatterns.Decorator;

public class EmailDecorator implements Email{

    protected Email emailHolder;

    public EmailDecorator(Email email){
        emailHolder = email;
    }
    @Override
    public void sendEmail() {
        emailHolder.sendEmail();
    }
}
