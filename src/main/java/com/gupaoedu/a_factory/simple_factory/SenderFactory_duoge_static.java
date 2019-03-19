package com.gupaoedu.a_factory.simple_factory;

import com.gupaoedu.a_factory.MailSender;
import com.gupaoedu.a_factory.Sender;
import com.gupaoedu.a_factory.SmsSender;

public class SenderFactory_duoge_static {
    public static Sender getMailSender(){
        return new MailSender();
    }

    public static Sender getSmsSedner(){
        return  new SmsSender();
    }
}
