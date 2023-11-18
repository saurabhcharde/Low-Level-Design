package org.example.designPatterns.Decorator;

public class BasicEmail implements Email{

    @Override
    public void sendEmail() {
        System.out.println("Email sent");
    }
}
