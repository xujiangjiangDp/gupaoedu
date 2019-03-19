package com.gupaoedu.b_singleten;

public class LazyInnerClassSingleton {
    private LazyInnerClassSingleton(){
        if(LazyHolder.lazyInnerClassSingleton != null){
            throw new RuntimeException("不可重复创建该实例");//针对
        }
    }

    public LazyInnerClassSingleton getInstance(){
        return LazyHolder.lazyInnerClassSingleton;
    }

    //内部类 实例化。类调用之前会先初始化内部类，避免了线程安全问题
    public static class LazyHolder{
        private static final LazyInnerClassSingleton lazyInnerClassSingleton = new LazyInnerClassSingleton();
    }
}
