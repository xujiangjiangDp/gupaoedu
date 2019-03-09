package com.gupaoedu.b_factory.simple_factory;

import com.gupaoedu.b_factory.MailSender;
import com.gupaoedu.b_factory.Sender;

public class Test {
    public static void main(String[] args) {
        SenderFactory senderFactory = new SenderFactory();

        Sender sender_1 = senderFactory.produce("mail");
        sender_1.send();

        Sender sender_2 = senderFactory.produce_className("com.gupaoedu.b_factory.MailSender");
        sender_2.send();

        Sender sender_3 = senderFactory.produce_class(MailSender.class);
        sender_3.send();

        //        Calendar.getInstance()
        //        LoggerFactory.getLogger()
    }
}
