package com.gupaoedu.a_factory.abstarct_factory;

public class MailReceiver implements Receiveer {
    @Override
    public void receive() {
        System.out.println("mail receive");
    }
}
