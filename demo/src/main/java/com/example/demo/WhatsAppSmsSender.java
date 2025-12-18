package com.example.demo;

public class WhatsAppSmsSender implements SmsSender {
    @Override
    public void send(String to) {
        System.out.println("WhatsAppSmsSender");
        System.out.println( "Sending WhatsApp sms to " + to);
    }
}
