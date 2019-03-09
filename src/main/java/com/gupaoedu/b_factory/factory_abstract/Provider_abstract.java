package com.gupaoedu.b_factory.factory_abstract;

import com.gupaoedu.b_factory.Sender;

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
