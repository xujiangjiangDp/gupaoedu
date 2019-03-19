package com.gupaoedu.a_factory.factory;

import com.gupaoedu.a_factory.Sender;

/**
 * 工厂接口类，不同对象通过不同工厂创建。
 * 避免新增对象，修改原有的工厂类
 */
public interface Provider {
    public Sender produce();
}
