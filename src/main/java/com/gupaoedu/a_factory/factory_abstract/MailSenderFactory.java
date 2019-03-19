package com.gupaoedu.a_factory.factory_abstract;

import com.gupaoedu.a_factory.MailSender;
import com.gupaoedu.a_factory.Sender;

public class MailSenderFactory extends Provider_abstract {
    @Override
    Sender produce() {
        return new MailSender();
    }
}
