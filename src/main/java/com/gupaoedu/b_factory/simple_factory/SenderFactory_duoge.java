package com.gupaoedu.b_factory.simple_factory;

import com.gupaoedu.b_factory.MailSender;
import com.gupaoedu.b_factory.Sender;
import com.gupaoedu.b_factory.SmsSender;

public class SenderFactory_duoge {
    public Sender getMailSender(){
        return new MailSender();
    }

    public Sender getSmsSedner(){
        return  new SmsSender();
    }
}
