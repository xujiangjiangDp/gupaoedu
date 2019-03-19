package com.gupaoedu.a_factory;

public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("send sms");
    }
}
