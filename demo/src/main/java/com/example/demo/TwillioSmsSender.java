package com.example.demo;

public class TwillioSmsSender implements SmsSender{
    @Override
    public void send(String to) {
        System.out.println("TwillioSmsSender");
        System.out.println("Sending sms to " + to);
    }
}
