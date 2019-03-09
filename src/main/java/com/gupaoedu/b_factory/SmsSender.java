package com.gupaoedu.b_factory;

public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("send sms");
    }
}
