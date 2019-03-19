package com.gupaoedu.a_factory.factory;

import com.gupaoedu.a_factory.Sender;

public class Test {
    public static void main(String[] args) {
        //创建不同对象使用不同的工厂类，避免新增对象，修改原有的工厂类

        MailSenderFactory mailSenderFactory = new MailSenderFactory();
        Sender sender = mailSenderFactory.produce();
        sender.send();


    }
}
