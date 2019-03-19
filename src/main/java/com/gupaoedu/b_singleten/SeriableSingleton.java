package com.gupaoedu.b_singleten;

import java.io.Serializable;

public class SeriableSingleton implements Serializable {

    //类加载时直接初始化
    private static final SeriableSingleton seriableSingleton = new SeriableSingleton();

    //私有构造
    private SeriableSingleton(){}

    public SeriableSingleton getInstance(){
        return seriableSingleton;
    }


    public Object readResolve(){//防止序列化，重写readResolve 方法
        return seriableSingleton;
    }
}
