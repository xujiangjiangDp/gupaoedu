package com.gupaoedu.a_factory;

public class MailSender implements Sender{
    @Override
    public void send() {
        System.out.println("send mail");
    }
}
