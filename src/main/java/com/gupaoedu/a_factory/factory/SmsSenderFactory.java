package com.gupaoedu.a_factory.factory;

import com.gupaoedu.a_factory.Sender;
import com.gupaoedu.a_factory.SmsSender;

public class SmsSenderFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
