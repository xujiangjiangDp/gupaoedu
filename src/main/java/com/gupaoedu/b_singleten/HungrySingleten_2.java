package com.gupaoedu.b_singleten;

public class HungrySingleten_2 {

    //类加载时直接初始化
    private static final HungrySingleten_2 hungrySingleten ;

    //静态块
    static {
        hungrySingleten = new HungrySingleten_2();
    }
    //私有构造
    private HungrySingleten_2(){}

    public HungrySingleten_2 getInstance(){
        return hungrySingleten;
    }

}
