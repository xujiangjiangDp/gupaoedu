package com.gupaoedu.c_singleten;

public class LazySimpleSingleten {
    private volatile static LazySimpleSingleten lazySimpleSingleten= null;

    private LazySimpleSingleten(){}

    //双重检查锁
    public LazySimpleSingleten getInstance(){
        if(lazySimpleSingleten == null){//如果为空，则初始化
            synchronized (LazySimpleSingleten.class){
                if(lazySimpleSingleten == null){//防止在多个线程等锁时，第一个线程初始化了，后面的线程进入，重新实例化
                    lazySimpleSingleten = new LazySimpleSingleten();
                }
            }
        }
        return lazySimpleSingleten;
    }

}
