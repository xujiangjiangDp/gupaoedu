package com.gupaoedu.b_factory.abstarct_factory;

import com.gupaoedu.b_factory.MailSender;
import com.gupaoedu.b_factory.Sender;

public class MailFactory implements Provider{
    @Override
    public Sender produce() {
        return new MailSender();
    }

    @Override
    public Receiveer receive() {
        return new MailReceiver();
    }
}
