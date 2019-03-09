package com.gupaoedu.b_factory.factory;

import com.gupaoedu.b_factory.Sender;
import com.gupaoedu.b_factory.SmsSender;

public class SmsSenderFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
