package com.gupaoedu.b_factory.factory_abstract;

import com.gupaoedu.b_factory.MailSender;
import com.gupaoedu.b_factory.Sender;

public class MailSenderFactory extends Provider_abstract {
    @Override
    Sender produce() {
        return new MailSender();
    }
}
