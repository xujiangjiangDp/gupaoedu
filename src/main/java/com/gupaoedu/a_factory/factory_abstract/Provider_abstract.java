package com.gupaoedu.a_factory.factory_abstract;

import com.gupaoedu.a_factory.Sender;

/**
 *  abstract
 *  相比 interface , 可以处理公共逻辑
 */
public abstract class Provider_abstract {
    public void pro_produce(){
        System.out.println("处理公共逻辑");
    }
    abstract Sender produce();
}
