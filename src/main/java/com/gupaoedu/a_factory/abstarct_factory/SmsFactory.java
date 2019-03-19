package com.gupaoedu.a_factory.abstarct_factory;

import com.gupaoedu.a_factory.Sender;
import com.gupaoedu.a_factory.SmsSender;

public class SmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }

    @Override
    public Receiveer receive() {
        return null;
    }
}
