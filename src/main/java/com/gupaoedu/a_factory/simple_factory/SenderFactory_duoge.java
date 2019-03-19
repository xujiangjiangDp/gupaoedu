package com.gupaoedu.a_factory.simple_factory;

import com.gupaoedu.a_factory.MailSender;
import com.gupaoedu.a_factory.Sender;
import com.gupaoedu.a_factory.SmsSender;

public class SenderFactory_duoge {
    public Sender getMailSender(){
        return new MailSender();
    }

    public Sender getSmsSedner(){
        return  new SmsSender();
    }
}
