package com.gupaoedu.b_factory.abstarct_factory;

import com.gupaoedu.b_factory.Sender;
import com.gupaoedu.b_factory.SmsSender;

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
