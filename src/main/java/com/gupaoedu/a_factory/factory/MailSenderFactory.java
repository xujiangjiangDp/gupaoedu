package com.gupaoedu.a_factory.factory;

import com.gupaoedu.a_factory.MailSender;
import com.gupaoedu.a_factory.Sender;

public class MailSenderFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
