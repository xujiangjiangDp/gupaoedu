package com.gupaoedu.b_factory.factory;

import com.gupaoedu.b_factory.MailSender;
import com.gupaoedu.b_factory.Sender;

public class MailSenderFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
